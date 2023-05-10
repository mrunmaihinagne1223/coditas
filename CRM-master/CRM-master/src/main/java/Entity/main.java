package Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        CRM crm = new CRM();
        User user = new User();
        Issues issues= new Issues();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(crm);
        session.save(user);
        session.save(issues);

        tx.commit();

        session.close();
        factory.close();
    }
}
