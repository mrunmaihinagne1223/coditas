package dao;

import dao.Dao;
import model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DaoImpl implements Dao{
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rt");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    @Override
    public void inser() throws IOException, ParseException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        System.out.println("enter name of Shop");
        String EnterShopName = br.readLine();

        Shop shop = new Shop();
        shop.setShop_name(EnterShopName);

        entityManager.persist(shop);

        int choice;
        do {
            System.out.println("enter 1 to addCustomer\n0 to exit");
            choice = Integer.parseInt(br.readLine());
            if (choice == 1) {
                System.out.println("enter Customer name");
                String Customername=br.readLine();

                Customer customer=new Customer(Customername,shop);
                entityManager.persist(customer);

            }
        }while(choice!=0);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
    public void insertProduct() throws IOException, ParseException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        System.out.println("Number Product to insert");
        int choies= Integer.parseInt(br.readLine());

        for (int i=0;i<choies;i++) {
            System.out.println("Enter Product Name");
            String product = br.readLine();

            System.out.println("Enter Product_date of Expiry (yyyy-MM-dd):");
            String dateString = br.readLine();
            Date datepulish = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);

            Product product1=new Product();
            product1.setProduvt_name(product);
            product1.setProduct_expdate(datepulish);

            entityManager.persist(product1);

        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }
    public void insertMappingInsert() throws IOException, ParseException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        System.out.println("enter CustomerId");
        int studentId= Integer.parseInt(br.readLine());

        Customer student = entityManager.find(Customer.class,studentId);

        entityManager.persist(student);

        System.out.println("Enter Number Product to add");
        int choies= Integer.parseInt(br.readLine());

        List<Product> subjectList=new ArrayList<>();
        for (int i=0;i<choies;i++) {

            System.out.println("Enter Product Id ");
            int subject_Id = Integer.parseInt(br.readLine());
            Product subject = entityManager.find(Product.class,subject_Id );

            subjectList.add(subject);
            entityManager.persist(subject);

        }
        System.out.println("Add in list");
        student.setProductList(subjectList);

        entityManager.persist(student);

        entityManager.getTransaction().commit();
        entityManager.close();



    }
    public void getExpiredCustomers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<String> query = cb.createQuery(String.class);
        Root<Customer> customerRoot = query.from(Customer.class);
        Join<Customer, Product> productJoin = customerRoot.join("productList");
        query.select(customerRoot.<String>get("customer_name"))
                .where(cb.lessThan(productJoin.<java.sql.Date>get("product_expdate"), new java.sql.Date(System.currentTimeMillis())));

        List<String> customers = entityManager.createQuery(query).getResultList();
        for (String customer : customers) {
            System.out.println(customer);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public void getCustomersNameStartingA() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<String> criteriaQuery = criteriaBuilder.createQuery(String.class);
        Root<Customer> customerRoot = criteriaQuery.from(Customer.class);

        criteriaQuery.select(customerRoot.<String>get("customer_name"));
        criteriaQuery.where(criteriaBuilder.like(customerRoot.<String>get("customer_name"), "A%"),
                            criteriaBuilder.equal(customerRoot.get("shop"),1));

        List<String>customerNmae=entityManager.createQuery(criteriaQuery).getResultList();

        for (String name  : customerNmae){
            System.out.println(name);
        }


        entityManager.getTransaction().commit();
        entityManager.close();
    }
    public void getProductDateRange() throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        System.out.println("Enter Range for Starting date (yyyy-mm-dd)");
        java.sql.Date StartingDate = java.sql.Date.valueOf(br.readLine());

        System.out.println("Enter Range for Ending date (yyyy-mm-dd)");
        java.sql.Date EndRange = java.sql.Date.valueOf(br.readLine());

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object[]>criteriaQuery=criteriaBuilder.createQuery(Object[].class);
        Root<Product>productRoot=criteriaQuery.from(Product.class);

        criteriaQuery.multiselect(productRoot.get("product_id"),productRoot.get("produvt_name"));
        criteriaQuery.where(criteriaBuilder.between(productRoot.<Comparable>get("product_expdate"),StartingDate,EndRange));

        TypedQuery<Object[]> typedQuery = entityManager.createQuery(criteriaQuery);
        List<Object[]> results = typedQuery.getResultList();

        for (Object[] result : results) {
            System.out.println("Student Name: " + result[0] + ", Enrollment date: " + result[1]);
        }
        entityManager.getTransaction().commit();
        entityManager.close();


    }
    public void getCustomersAndProducts( ) throws IOException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        System.out.println("Enter Project Name");
        String ProductNmae=br.readLine();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
        Root<Customer> customerRoot = criteriaQuery.from(Customer.class);
        Join<Customer, Product> productJoin = customerRoot.join("productList");

        criteriaQuery.multiselect(customerRoot.get("customer_name"), productJoin.get("produvt_name"));
        criteriaQuery.where(criteriaBuilder.equal(productJoin.get("produvt_name"), ProductNmae));

        TypedQuery<Object[]> typedQuery = entityManager.createQuery(criteriaQuery);
        List<Object[]> results = typedQuery.getResultList();

        for (Object[] result : results) {
            System.out.println("Customer Name: " + result[0] + ", Product Name: " + result[1]);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void getProductsIn() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
        Root<Product> ProductRoot = criteriaQuery.from(Product.class);

        criteriaQuery.select(ProductRoot).where(ProductRoot.<Boolean>get("produvt_name").in("Mushroom","Brinjal"));

        TypedQuery<Product> typedQuery = entityManager.createQuery(criteriaQuery);
        List<Product> results = typedQuery.getResultList();

        for (Product product : results) {
            System.out.println("Product Name: " + product.getProduvt_name() + ", Expiration date: " + product.getProduct_expdate());
        }

        entityManager.getTransaction().commit();
        entityManager.close();

    }
    public int sumProductIds() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Integer> criteriaQuery = criteriaBuilder.createQuery(Integer.class);
        Root<Product> productRoot = criteriaQuery.from(Product.class);

        criteriaQuery.select(criteriaBuilder.sum(productRoot.<Integer>get("product_id")));

        TypedQuery<Integer> typedQuery = entityManager.createQuery(criteriaQuery);
        int sum = typedQuery.getSingleResult();

        entityManager.close();

        return sum;
    }



    @Override
    public void update(int id) throws IOException {

    }

    @Override
    public void delete(int id) throws IOException {

    }

    @Override
    public void Show(int id) throws IOException {

    }
}