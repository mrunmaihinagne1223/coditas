import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.List;

@WebServlet("/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();


        String email = req.getParameter("username");
        String pwd = req.getParameter("password");
        ServletContext sr = getServletContext();

        try {
            Class.forName(sr.getInitParameter("driver"));
            Connection con = DriverManager.getConnection(sr.getInitParameter("url"), sr.getInitParameter("username"), sr.getInitParameter("password"));

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(" select username,password from login");
            int cout=0;
            while (rs.next()){
                String un = rs.getString(1);
                String ps=rs.getString(2);

                if(un.equals(email)&& ps.equals(pwd)){
                    cout++;
                    break;
                }

            }
            if (cout==0){
                out.println("<p style='color: red;'>Invalid username or password. Please try again.</p>");
                RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.jsp");
                requestDispatcher.include(req,resp);
            }
            if(cout>0){
                resp.sendRedirect("index.html");
            }






        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }



    }
}
