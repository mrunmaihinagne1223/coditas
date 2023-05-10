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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //servalet
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //hibernet
        Configuration configuration= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer1.class).addAnnotatedClass(Product1.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction =session.beginTransaction();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("user-type");

         if(role.equalsIgnoreCase("user")) {
            String hql = "from Customer1 u where u.username = :username and u.password = :password";
            // Execute the query against the database
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            query.setParameter("password", password);

            List<Customer1>userlist = query.getResultList();
            if (userlist.isEmpty()) {
                out.println("<p style='color: red;'>Invalid username or password. Please try again.</p>");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
                requestDispatcher.include(req, resp);
            }
            for (Customer1 user:userlist){
                HttpSession session1=req.getSession();
                session1.setAttribute("userfetchid", user.getCustid());
                System.out.println("FETCH Value"+session1.getAttribute("userfetchid"));

            }
            resp.sendRedirect("Customerlogin");
        }
        transaction.commit();
        session.close();


}
}
