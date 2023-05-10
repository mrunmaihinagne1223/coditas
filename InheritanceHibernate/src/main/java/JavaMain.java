import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JavaMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(FulltimeEmp.class)
                .addAnnotatedClass(PartTimeEmp.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        Employee em =new Employee(1,"priya");
        Employee em1 = new Employee(2,"Omakr");





        PartTimeEmp partTimeEmp = new PartTimeEmp(3,"Mrunmai", 200, 15);
        FulltimeEmp fulltimeEmp = new FulltimeEmp(4,"Sujan", 5000, 12, 200);


        session.save(partTimeEmp);
        session.save(fulltimeEmp);


        session.save(em);
        session.save(em1);

        transaction.commit();
        session.close();
    }
}
