package dao;

import model.Address;
import model.Book;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import org.hibernate.query.Query;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

public class BookDaoImple implements BookDao {

    private static final Configuration CONFIGURATION = new Configuration().configure("hibernate.cfg.xml")
            .addAnnotatedClass(Book.class);
    private static final SessionFactory SESSION_FACTORY = CONFIGURATION.buildSessionFactory();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    @Override
    public void insertBook(Book book) throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction =session.beginTransaction();
        System.out.println("Please enter the book's bid:");
        book.setBid(Integer.parseInt(br.readLine()));

        System.out.println("Please enter the book's name:");
        book.setBookname(br.readLine());

        System.out.println("Please enter the book's price:");
        book.setPrice(Integer.parseInt(br.readLine()));

        System.out.println("Please enter the author's name:");
        book.setAuthername(br.readLine());

        System.out.println("Please enter the book's publisher:");
        book.setPublisher(br.readLine());

        System.out.println("Please enter the book's publish year:");
        book.setPublishyear(Integer.parseInt(br.readLine()));

        System.out.println("Please enter the book's Delivery Addresss:");
        Address address = new Address();
        System.out.println("Enter Country");
        address.setCountry(br.readLine());
        System.out.println("Enter State");
        address.setState(br.readLine());
        System.out.println("Enter Pincode ");
        address.setPincode(Integer.parseInt(br.readLine()));
        book.setAddress(address);
        session.save(book);
        transaction.commit();
        session.close();
        System.out.println("Book added successfully!");

    }

    @Override
    public List<Book> selectAllTodos() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Book", Book.class);
        List<Book> books = query.getResultList();
     return books;
    }
    public List<Book> listbookprice(int price){
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Book b where b.price > :price", Book.class);
        query.setParameter("price", price);
        List<Book> books = query.getResultList();
        return books;
    }

    @Override
    public boolean deleteTodo(int id) throws SQLException {
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

    @Override
    public int updateTodo(int id,Book updatedBook) throws SQLException, IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        Book book = session.get(Book.class, id);
        book.setBookname(updatedBook.getBookname());
        book.setPrice(updatedBook.getPrice());
        book.setAuthername(updatedBook.getAuthername());
        book.setPublisher(updatedBook.getPublisher());
        book.setPublishyear(updatedBook.getPublishyear());
        session.update(book);
        transaction.commit();
        session.close();
        return 1;

    }
    public List<Book> fetchCriteria(float price) throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Book.class);
        criteria.add(Restrictions.gt("price", price));

        List<Book> books = criteria.list();

        transaction.commit();
        session.close();

        return books;
    }

    public List<Book> fetechCritera2(String order, String pn)throws IOException {
        Session session = SESSION_FACTORY.openSession();
        Criteria c= session.createCriteria(Book.class);
        if(order.equalsIgnoreCase("asc")){
            c.addOrder(Order.asc(pn));

        }
        else if(order.equalsIgnoreCase("desc")){
            c.addOrder(Order.desc(pn));
        }
       return c.list();
    }

    public static void singleprojection() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Session session = SESSION_FACTORY.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter property name to fetch records: ");
        String propertyName = br.readLine();

        Criteria criteria = session.createCriteria(Book.class);
        criteria.setProjection(Projections.property(propertyName));

        List<Object> prices = criteria.list();

        for (Object price : prices) {
            System.out.println("Price: " + price);
        }

        tx.commit();
        session.close();
    }
    public static void multipleProjections() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Session session = SESSION_FACTORY.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter properties to fetch records: ");
        String[] propertyNames = br.readLine().split(",");

        ProjectionList projectionList = Projections.projectionList();
        for (String propertyName : propertyNames) {
            projectionList.add(Projections.property(propertyName));
        }

        Criteria criteria = session.createCriteria(Book.class);
        criteria.setProjection(projectionList);

        List<Object[]> results = criteria.list();

        for (Object[] result : results) {
            for (Object value : result) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        tx.commit();
        session.close();
    }



}