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
@WebServlet("/AdminEditing")
public class AdminEditing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        ServletContext context = getServletContext();
        out.println("IM in admin");
        int id = Integer.parseInt(req.getParameter("id3"));
        int id1=0;
        String name = "";
        String email = "";
        String pass = "";
        String city ="";
        String phone = "";
        try {

            Class.forName(context.getInitParameter("driver"));
            Connection con = DriverManager.getConnection(context.getInitParameter("url"), context.getInitParameter("username"), context.getInitParameter("password"));
            PreparedStatement ps = con.prepareStatement("select*from users where id=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                id1=rs.getInt(1);
                name = rs.getString(2);
                email = rs.getString(3);
                pass = rs.getString(4);
                city = rs.getString(5);
                phone = rs.getString(6);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        out.println("<h2>Student ID:"+id+"</h2>" +
                "<form action='UpdateDB'>" +
                "NAME: <input type='text' name='nameup' value='"+name+"'>" +
                "EMAIL:<input type='text' name='emailup' value='"+email+"'>" +
                "CITY:<input type='text' name='cityup' value='"+city+"'>" +
                "PHONE:<input type='text' name='phoneup' value='"+phone+"'>" +
                "<input type='hidden' name='idup' value='"+id+"' >"+
                "<input type='submit' value='UPDATE'>" +
                "</form>");


    }

    }

