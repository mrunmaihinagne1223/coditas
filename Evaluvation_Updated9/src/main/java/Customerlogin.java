import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

@WebServlet("/Customerlogin")
public class Customerlogin extends HttpServlet {
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
        int userfetchid = 0;
        HttpSession session1=req.getSession(false);
//        int userfetchid = (int) session1.getAttribute("userfetchid");

        if (session1.getAttribute("userfetchid") != null) {
            userfetchid = (int) session1.getAttribute("userfetchid");
            // rest of your code that uses userfetchid goes here
        } else {
            out.println("Invalid login");
        }

        out.println("WELCOME USER ID :  "+userfetchid);
        out.println("<br>");
        out.println("*************************MYDATA*********************************");
        out.println("<br>");

        Query q =session.createQuery("from Customer1 u where u.id=:id ");
        q.setParameter("id",userfetchid);
        List<Customer1> userlist = q.getResultList();

        out.println("<table>");
        out.println("<tr><th>ID</th><th>Name</th><th>UserName</th></tr>");
        for (Customer1 user : userlist) {
            out.println("<tr>");
            out.println("<td>" + user.getCustid() + "</td>");
            out.println("<td>" + user.getCustname() + "</td>");
            out.println("<td>" + user.getUsername() + "</td>");

            out.println("</tr>");
        }
        out.println("</table>");

        out.println("<a href='SaveProduct'>Add a Product</a>");
        out.println("<Br>");
        out.println("<a href='Bill'> genrate bill</a>");

        out.println();
        out.println("************************************MY PRODUCTS**********************************************");


        String name = "bag";
        String price = "800";
        String qty = "7";

        String name1 = "Umberala";
        String price1 = "800";
        String qty1 = "7";

        String name2 = "bottel";
        String price2 = "800";
        String qty2 = "7";

        out.println("<table>");
        out.println("<tr>");
        out.println("<td>");
        out.println("+----------+-------+-----+<br>");
        out.println("|   Name   | Price | Qty |<br>");
        out.println("+----------+-------+-----+<br>");
        out.println("|    " + name + "   |  " + price + "  |  " + qty + "  | \"<a href='deleteUser'>Deleteme</a>\"<br>");
        out.println("| " + name1 + " |  " + price1 + "  |  " + qty1 + "  |<br>");
        out.println("|  " + name2 + "  |  " + price2 + "  |  " + qty2 + "  |<br>");
        out.println("+----------+-------+-----+<br>");
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");





        out.println("<a href='deleteUser'>Deleteme</a>");
        out.println("<a href='edit.jsp'>UpdateMe</a>");

        out.println("<a href ='Logout'>logout</a>");

        transaction.commit();;
        session.close();
    }
}
