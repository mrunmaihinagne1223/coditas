package DAO;

import Entity.CRM;
import Entity.Issues;
import Entity.Role;
import Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class CrmDAO {
    static Configuration cfg = new Configuration().configure();
    static SessionFactory factory = cfg.buildSessionFactory();


    public static void insertCRM(CRM newCRM, Role role) {


        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(newCRM);
        s.save(role);
        tx.commit();
        s.close();
    }

    public static List<CRM> selectAllCrm(){

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        List<CRM> crms =s.createQuery("from CRM").list();
        tx.commit();
        s.close();
        return crms;
    }

    public static void insertUser(User newUser, Role role){
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(newUser);
        s.save(role);
        tx.commit();
        s.close();
    }

    public static List<User> selectAllUser(int id) {
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        System.out.println(id);
        Query query = s.createQuery("from User where crm.c_id=:id");
        query.setParameter("id", id);
        List<User> users = query.getResultList();

        tx.commit();
        s.close();
        return users;
    }

    public static void insertIssue(Issues issues) {
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(issues);
        tx.commit();
        s.close();
    }

    public static List<Issues> selectAllIssues(int uId) {
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        System.out.println(uId);
        Query query = s.createQuery("from Issues where user.u_id=:id");
        query.setParameter("id", uId);
        List<Issues> issues = query.getResultList();

        tx.commit();
        s.close();
        return issues;
    }

    public static List<Issues> selectAllPendingIssues(int cId) {
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        Query query = s.createQuery("FROM Issues WHERE user.crm.c_id = :c_id AND status != 'Resolved'");

        query.setParameter("c_id", cId);
        List<Issues> issues = query.getResultList();

        tx.commit();
        s.close();
        return issues;
    }

    public static List<Issues> selectHistory(int cId) {
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        Query query = s.createQuery("FROM Issues WHERE user.crm.c_id = :c_id AND status = 'Resolved'");
        query.setParameter("c_id", cId);
        List<Issues> issues = query.getResultList();
        tx.commit();
        s.close();
        return issues;
    }

    public static void deleteTodo(int id) {
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        Issues issues = s.get(Issues.class, id);
        s.delete(issues);
        tx.commit();
        s.close();
    }

    public static List<User> selectAllUsers() {
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        Query query = s.createQuery("from User");

        List<User> users = query.getResultList();

        tx.commit();
        s.close();
        return users;
    }

    public static List<Issues> selectAllPendingIssuesAdmin() {
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        Query query = s.createQuery("FROM Issues WHERE status != 'Resolved'");

        List<Issues> issues = query.getResultList();

        tx.commit();
        s.close();
        return issues;
    }
}
