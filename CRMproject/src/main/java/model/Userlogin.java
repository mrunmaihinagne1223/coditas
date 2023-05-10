package model;

import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet("/Userlogin")
public class Userlogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //servalet
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //hibernet
        Configuration configuration= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class).addAnnotatedClass(CRM.class).
                addAnnotatedClass(RaisedComplain.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction =session.beginTransaction();

        HttpSession session1=req.getSession(false);
        int userfetchid = (int) session1.getAttribute("userfetchid");
        System.out.println(userfetchid+"fetchid");
        out.println("WELCOME  "+userfetchid);

        out.println("<br>");
        out.println("*************************MYDATA*********************************");
        out.println("<br>");

        Query q =session.createQuery("from User u where u.id=:id ");
        q.setParameter("id",userfetchid);
        List<User> userlist = q.getResultList();

        out.println("<table>");
        out.println("<tr><th>ID</th><th>Name</th><th>Email</th></tr>");
        for (User user : userlist) {
            out.println("<tr>");
            out.println("<td>" + user.getId() + "</td>");
            out.println("<td>" + user.getName() + "</td>");
            out.println("<td>" + user.getEmail() + "</td>");

            out.println("</tr>");
        }
        out.println("</table>");

        out.println("<br>");
        out.println("****************************************************************");
        out.println("<br>");






        transaction.commit();
        session.close();



    }

}
