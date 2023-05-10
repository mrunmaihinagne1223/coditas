package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/editUser")
public class Edit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Configuration configuration= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class).addAnnotatedClass(Adminlogin.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction =session.beginTransaction();


        String  name =req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        int id4 = Integer.parseInt(req.getParameter("id4"));

        List<User> list = session.createQuery("FROM User e WHERE e.id = :empId")
               .setParameter("empId", id4).list();

        System.out.println(list);

        User Updatedcustomer =new User(id4,name,username,password);

        User user=session.get(User.class,id4);
        user.setId(Updatedcustomer.getId());
        user.setName(Updatedcustomer.getName());
        user.setUsername(Updatedcustomer.getUsername());
        user.setPassword(Updatedcustomer.getPassword());

        session.update(user);


        resp.sendRedirect("Adminlogin");
        transaction.commit();
        session.close();
        sf.close();
    }
//  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        Configuration configuration = new Configuration().configure();
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        int id = Integer.parseInt(request.getParameter("id"));
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        List<User> list = session.createQuery("FROM Customer e WHERE e.customerId = :empId")
//                .setParameter("empId", id).list();
//        request.setAttribute("crmList", list);
//        transaction.commit();
//        session.close();
//        RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerEditForm.jsp");
//        dispatcher.forward(request, response);
//    }
}
