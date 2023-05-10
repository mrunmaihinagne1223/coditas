package dao;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.Session;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class DaoImpl implements Dao {
    private static final Configuration CONFIGURATION = new Configuration().configure("hibernate.cfg.xml")
            .addAnnotatedClass(Book.class).addAnnotatedClass(Student.class);
    private static final SessionFactory SESSION_FACTORY = CONFIGURATION.buildSessionFactory();
    Book book=new Book();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    @Override
    public void insertBook(Book book) throws SQLException, IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter Book name");
        book.setBook_name(br.readLine());

        session.save(book);

        transaction.commit();
        session.close();


    }

    @Override
    public void insertStudent(Student student) throws SQLException, IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter student name:");
        student.setStudent_name(br.readLine());

        System.out.println("Enter student address:");
        student.setAddress(br.readLine());


        session.save(student);

        transaction.commit();
        session.close();
        System.out.println("Student added with book successfully!");
    }

    public void insertStudentwithBook(int sid,List<Book>bookList) throws SQLException, IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();


        Student student = session.get(Student.class,sid);

        student.setBooks(bookList);
        session.save(student);

        transaction.commit();
        session.close();

        System.out.println("Student added with book successfully!");

    }

    public void updateStudent(int sid) throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class,sid);

        System.out.println("Enter student name you want to update");
        String name = br.readLine();
        System.out.println("Enter student city you want to update");
        String city = br.readLine();

        student.setStudent_name(name);
        student.setAddress(city);

        session.save(student);
        transaction.commit();
        session.close();

        System.out.println("Student updated successfully!");
    }


    public void insertBookandstudent() throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Enter Student Id");
        int userFetchId= Integer.parseInt(br.readLine());
        Student user = session.get(Student.class, userFetchId);

        List<Book> productList = new ArrayList<>();
        System.out.println("Enter Number Book ");
        int count= Integer.parseInt(br.readLine());
        for (int i=0;i<count;i++) {

            System.out.println("Enter  Book name ");
            String name = br.readLine();
            Book product = new Book(name, user);
            productList.add(product);
            session.save(product);

        }
        user.setBooks(productList);
        session.save(user);

        transaction.commit();
        session.close();

    }
    public void insertBookandstudentNumber() throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Enter Student Id in which you when add book ");
        int userFetchId= Integer.parseInt(br.readLine());
        Student user = session.get(Student.class, userFetchId);

        List<Book> productList = new ArrayList<>();
        System.out.println("Enter Number Books to add ");
        int count= Integer.parseInt(br.readLine());
        for (int i=0;i<count;i++) {

            System.out.println("Enter  Book Id ");
            int bid = Integer.parseInt(br.readLine());
            Book book1 = session.get(Book.class,bid);
            book1.setStudent(user);

            productList.add(book1);
            session.save(book1);

        }
        System.out.println("Add in list");
        user.setBooks(productList);
        session.save(user);

        transaction.commit();
        session.close();

    }

    @Override
    public List<Book> selectAllTodos() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        String hql ="from Book"; // using the correct entity name
        Query query = session.createQuery(hql, Book.class);
        List<Book> books = query.getResultList();
        return books;
    }

    public void addstudent(Student student) throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter studentname");
        String name= br.readLine();
        student.setStudent_name(name);
        session.save(student);
        transaction.commit();

    }

    @Override
    public boolean deleteTodo(int id) throws SQLException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        Book book=session.get(Book.class,id);
        if(book!=null){
            session.delete(book);
            transaction.commit();
            session.close();
            return true;
        }

        return false;
    }
    public List<Object[]> selectQuery() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "SELECT s.sid, s.student_name, b.book_name " +
                "FROM Student s " +
                "JOIN s.books b " +
                "WHERE s.address = :address AND b.book_name = :bookName";
        Query query = session.createQuery(hql);
        query.setParameter("address", "Pune");
        query.setParameter("bookName", "Ramayan");
        List<Object[]> results = query.getResultList();

        transaction.commit();
        session.close();
        return results;
    }
    public boolean deletebook(int id) throws SQLException {
        Session session=SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        Book book=session.get(Book.class,id);
        if(book!=null){
            session.delete(book);
            transaction.commit();
            session.close();
            return true;
        }
        return false;
    }






}
