import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/UpdateDB")
public class UpdateDB extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext context = getServletContext();

        String name=req.getParameter("nameup");
        int id= Integer.parseInt(req.getParameter("idup"));
        String email=req.getParameter("emailup");
        String city=req.getParameter("cityup");
        String phone=req.getParameter("phoneup");

        try {

            Class.forName(context.getInitParameter("driver"));
            Connection con = DriverManager.getConnection(context.getInitParameter("url"), context.getInitParameter("username"), context.getInitParameter("password"));

            PreparedStatement p = con.prepareStatement("update users set id='"+id+"',name='"+name+"',email='"+email+"',city='"+city+"',phone='"+phone+"' where id=?");
            p.setInt(1,id);

            p.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }

        RequestDispatcher rd = req.getRequestDispatcher("adminPage");
        rd.forward(req,response);

    }
}
