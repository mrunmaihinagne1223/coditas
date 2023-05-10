package web;



import dao.DaoImpl;
import model.Book;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class App {
        public static void main(String[] args) throws IOException, SQLException {
            System.out.println("BOOK MANAGEMENT SYSTEM");

             Configuration CONFIGURATION = new Configuration().configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Book.class).addAnnotatedClass(Student.class);
            SessionFactory SESSION_FACTORY = CONFIGURATION.buildSessionFactory();
            Book book=new Book();
            Student student = new Student();


            Scanner scanner = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            DaoImpl daoimpl = new DaoImpl();

            boolean flag = true;
            while (flag) {

                System.out.println("1. Insert book");
                System.out.println("2. Insert student");
                System.out.println("3. Insert student bookwise");
                System.out.println("4. List of student from pune took ramayan");
                System.out.println("5. Update student");
                System.out.println("6 show all books");
                System.out.println("0. Exit");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        daoimpl.insertBook(book);
                        break;
                     case 2:
                         daoimpl.insertStudent(student);
                         break;
                    case 3:
                        daoimpl.insertBookandstudentNumber();
                        break;
                    case 4:
                        List<Object[]> results = daoimpl.selectQuery();
                        for (Object[] result : results) {
                            System.out.println("Student ID: " + result[0]);
                            System.out.println("Student Name: " + result[1]);
                            System.out.println("Book Name: " + result[2]);
                        }

                        List<Object[]> results1 = daoimpl.selectQuery();

                         System.out.printf("%-10s %-20s %-20s\n", "Student ID", "Student Name", "Book Name");
                         System.out.println("----------------------------------------------------------");

                         for (Object[] result : results1) {
                        System.out.printf("%-10s %-20s %-20s\n", result[0], result[1], result[2]);
                         }
                         System.out.println("----------------------------------------------------------");
                        break;
                    case 5:
                        System.out.println("Enter Id of student to update");
                        int id = Integer.parseInt(br.readLine());
                        daoimpl.updateStudent(id);

                        break;
                    case 6:

                        List<Book> bookList = daoimpl.selectAllTodos();
                        System.out.println("----------------------------------------------------------");

                        for (Book book1 : bookList) {
                            System.out.println();
                            System.out.printf("%-10s %-30s%n", "Book ID", "Book Name");
                            System.out.printf("%-10d %-30s%n", book1.getBid(), book1.getBook_name());
                        }
                        System.out.println("----------------------------------------------------------");



                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 0:
                        flag = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }


