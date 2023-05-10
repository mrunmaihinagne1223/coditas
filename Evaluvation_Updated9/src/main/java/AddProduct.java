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
import java.util.ArrayList;
import java.util.List;
@WebServlet("/SaveProduct")
public class AddProduct extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer1.class)
                .addAnnotatedClass(Product1.class);

        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        String name = "bag";
        String price = "800";
        String qty = "7";

        String name1 = "Umberala";
        String price1 = "800";
        String qty1 = "7";

        String name2 = "bottel";
        String price2 = "800";
        String qty2 = "7";


        HttpSession session1 = req.getSession(false);
        int userFetchId = (int) session1.getAttribute("userfetchid");

        Customer1 user = session.get(Customer1.class, userFetchId);
        Product1 product = new Product1(name, price, qty, user);
        Product1 product1 = new Product1(name1, price1, qty1, user);
        Product1 product2 = new Product1(name2, price2, qty2, user);

        List<Product1> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        user.setProductList(productList);

        session.save(product);
        session.save(user);

        transaction.commit();
        session.close();

        resp.sendRedirect("Customerlogin");
    }
}
