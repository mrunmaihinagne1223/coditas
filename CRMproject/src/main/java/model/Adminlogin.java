package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/Adminlogin")
public class Adminlogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //servalet
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //hibernet
        Configuration configuration= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class).addAnnotatedClass(CRM.class).addAnnotatedClass(Adminlogin.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction =session.beginTransaction();
        out.println("ADMIN LOGIN");
        out.println("<br>");
        out.println("<button type=button onclick=location.href='crmregistration.jsp'>Register CRM</button>\n");
        out.println("<br>");
        out.println("*********************************USER LIST*********************************************");


        List<User>userlist = session.createQuery("from User").getResultList();
        out.println("<table>");
        out.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Delete</th><th>Edit</th></tr>");
        for (User user : userlist) {
            out.println("<tr>");
            out.println("<td>" + user.getId() + "</td>");
            out.println("<td>" + user.getName() + "</td>");
            out.println("<td>" + user.getEmail() + "</td>");
            out.println("<td><a href='deleteUser?id3=" + user.getId() + "'>Delete</a></td>");
            out.println("<td><a href='edit.jsp?id3=" + user.getId() + "'>Edit</a></td>");
            out.println("</tr>");
        }
        out.println("</table>");
        transaction.commit();
        session.close();

        out.println("********************************CRMList**********************************************");



        Session se = sf.openSession();
        Transaction tx =se.beginTransaction();
        List<CRM>crmslist = se.createQuery("from CRM").getResultList();
        out.println("<table>");
        out.println("<tr><th>ID</th><th>Name</th><th>User</th></tr>");
        for (CRM crm : crmslist) {
            out.println("<tr>");
            out.println("<td>" + crm.getId() + "</td>");
            out.println("<td>" + crm.getName() + "</td>");
            out.println("<td>" + crm.getUsername() + "</td>");
            out.println("</tr>");
        }

        out.println("*********************************************************************************");


        out.println("<br>");
        out.println("<button type=button onclick=location.href='crmregistration.jsp'>Register CRM</button>\n");
        out.println("<br>");


        tx.commit();
        se.close();

        sf.close();


    }
}
