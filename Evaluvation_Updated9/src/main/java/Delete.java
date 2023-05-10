

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/deleteUser")
public class Delete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Configuration configuration= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer1.class).addAnnotatedClass(Product1.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction =session.beginTransaction();

        HttpSession session1=req.getSession(false);
        int userfetchid = (int) session1.getAttribute("userfetchid");
        System.out.println(userfetchid+"fetchid");
        Customer1 user=session.get(Customer1.class,userfetchid);
        if(user!=null){
            session.delete(user);
            transaction.commit();
            session.close();
            resp.sendRedirect("login.jsp");

        }
        //Dont yoy in dele
        // te
//        transaction.commit();;
//        session.close();

    }






}

