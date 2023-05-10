package web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import dao.BookDaoImple;

public class App  {
    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("BOOK MANAGEMENT SYSTEM");

        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BookDaoImple bookDaoImple = new BookDaoImple();
        Book book = new Book();

        boolean flag = true;
        while (flag) {
            System.out.println("\nENTER 1: INSERT");
            System.out.println("ENTER 2: UPDATE");
            System.out.println("ENTER 3: DELETE");
            System.out.println("ENTER 4: SHOW");
            System.out.println("ENTER 5: Price list above 200 using query");
            System.out.println("ENTER 8: Single Projection");
            System.out.println("ENTER 9: Multiple Projection");
            System.out.println("ENTER 0: EXIT");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookDaoImple.insertBook(book);
                    break;
                case 2:
                    //TODO: Implement update
                    System.out.println("Enter the id of the book to update:");
                    int id = Integer.parseInt(br.readLine());
                    System.out.println("Enter the updated details of the book:\n" +
                            "Book name: \n" +
                            "Price: \n" +
                            "Author name: \n" +
                            "Publisher: \n" +
                            "Publisher year: \n" +
                            "Address Constant");
                    Book updatedBook = new Book();
                    updatedBook.setBookname(br.readLine());
                    updatedBook.setPrice(Integer.parseInt(br.readLine()));
                    updatedBook.setAuthername(br.readLine());
                    updatedBook.setPublisher(br.readLine());
                    updatedBook.setPublishyear(Integer.parseInt(br.readLine()));
                    int result = bookDaoImple.updateTodo(id, updatedBook);
                    if (result == 1) {
                        System.out.println("Book updated successfully!");
                    } else {
                        System.out.println("Book update failed.");
                    }
                    break;
                case 3:
                    //TODO: Implement delete
                    System.out.println("ENTER ID TO DELETE");
                    bookDaoImple.deleteTodo(Integer.parseInt(br.readLine()));
                    break;
                case 4:
                    //TODO: Implement show
                    List<Book> bookList = bookDaoImple.selectAllTodos();
                    for (Book book1 : bookList) {
                        System.out.println();
                        System.out.printf("%-10s %-30s %-20s %-20s %-15s %-10s %-40s%n",
                                "Book ID", "Book Name", "Author Name", "Publisher", "Publish Year", "Price", "Address");
                        System.out.printf("%-10d %-30s %-20s %-20s %-15d %-10d %-40s%n",
                                book1.getBid(), book1.getBookname(), book1.getAuthername(), book1.getPublisher(),
                                book1.getPublishyear(), book1.getPrice(), book1.getAddress());

                    }
                    break;
                case 5:
                    System.out.println("FETCH DATA PRICE GREATER THAN");
                    List<Book> bookList2 = bookDaoImple.listbookprice(Integer.parseInt(br.readLine()));
                    for (Book book1 : bookList2) {
                        System.out.printf("%-10s %-30s %-20s %-20s %-15s %-10s %-40s%n",
                                "Book ID", "Book Name", "Author Name", "Publisher", "Publish Year", "Price", "Address");
                        System.out.printf("%-10d %-30s %-20s %-20s %-15d %-10d %-40s%n",
                                book1.getBid(), book1.getBookname(), book1.getAuthername(), book1.getPublisher(),
                                book1.getPublishyear(), book1.getPrice(), book1.getAddress());

                    }

                    break;
                case 6:
                    //creteria
                    System.out.println("Enter Price to be apply, based on createria");
                    List<Book> bookList22 = bookDaoImple.fetchCriteria(Integer.parseInt(br.readLine()));
                    for (Book book1 : bookList22) {
                        System.out.printf("%-10s %-30s %-20s %-20s %-15s %-10s %-40s%n",
                                "Book ID", "Book Name", "Author Name", "Publisher", "Publish Year", "Price", "Address");
                        System.out.printf("%-10d %-30s %-20s %-20s %-15d %-10d %-40s%n",
                                book1.getBid(), book1.getBookname(), book1.getAuthername(), book1.getPublisher(),
                                book1.getPublishyear(), book1.getPrice(), book1.getAddress());

                    }
                case 7:

                    System.out.println("Enter 7 to be apply, based on createria");
                    List<Book> bookList222 = bookDaoImple.fetechCritera2(br.readLine(),br.readLine());
                    for (Book book1 : bookList222) {
                        System.out.printf("%-10s %-30s %-20s %-20s %-15s %-10s %-40s%n",
                                "Book ID", "Book Name", "Author Name", "Publisher", "Publish Year", "Price", "Address");
                        System.out.printf("%-10d %-30s %-20s %-20s %-15d %-10d %-40s%n",
                                book1.getBid(), book1.getBookname(), book1.getAuthername(), book1.getPublisher(),
                                book1.getPublishyear(), book1.getPrice(), book1.getAddress());

                    }
                case 8:
                    System.out.println("Enter the name of the property to be projected:");
                    BookDaoImple.singleprojection();
                    break;

                case 9:
                    BookDaoImple.multipleProjections();
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
