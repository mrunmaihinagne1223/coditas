package Servlet;

import Entity.CRM;
import Entity.User;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();


        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        List<CRM> crms = s.createQuery("from CRM").list();
        List<User> users = s.createQuery("from User").list();
        tx.commit();
        s.close();

        System.out.println(role);

        if(role.equals("crm") || role.equals("admin")){

        for (CRM crm : crms) {
            if (email.equals(crm.getC_email()) && password.equals(crm.getC_password())) {

                RequestDispatcher rd = request.getRequestDispatcher("crm-page.jsp");
                HttpSession session = request.getSession();
                session.setAttribute("crmId", crm.getC_id());
                session.setAttribute("crmObj", crm);
                System.out.println(crm.getC_id());
                rd.forward(request, response);
            } else if (email.equals("admin") && password.equals("admin")) {
                RequestDispatcher rd = request.getRequestDispatcher("adminPage.jsp");
                rd.forward(request, response);
            }
        }}

        if(role.equals("user"))
        {
        for (User user:users) {
            if (email.equals(user.getU_email())&&password.equals(user.getU_password())){
                RequestDispatcher rd = request.getRequestDispatcher("user-page.jsp");
                HttpSession session = request.getSession();
                session.setAttribute("userId", user.getU_id());
                rd.forward(request, response);
            }
        }
    }}}

