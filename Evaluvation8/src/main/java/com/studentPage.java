package com;

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
import java.util.ResourceBundle;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet("/studentPage")
public class studentPage extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        HttpSession session=req.getSession();
        String name = (String) session.getAttribute("uname");
        int Id = (int) session.getAttribute("Id");
        ServletContext context = getServletContext();


        if(name==null){
            resp.sendRedirect("index.jsp");
        }
        else {
            out.println("WELCOME STUDENT " + name);
            out.println("ID is " + Id);
            out.println("<br>");
            out.println("<br>");
            try{
                Class.forName(context.getInitParameter("driver"));
                Connection con = DriverManager.getConnection(context.getInitParameter("url"),
                        context.getInitParameter("username"), context.getInitParameter("password"));

                PreparedStatement ps=con.prepareStatement("select * from users where name = ? and id = ?");
                ps.setString(1,name);
                ps.setInt(2,Id);
                ResultSet rs=ps.executeQuery();

                // Start table
                out.println("<table border='1'>");
                out.println("<tr><th>Email</th><th>name</th><th>Password</th><th>City</th><th>Phone</th></tr>");


                while (rs.next()){
                    int id =rs.getInt(1);
                    String nameL = rs.getString(2);
                    String email =rs.getString(3);
                    String password = rs.getString(4);
                    String city = rs.getString(5);

                    String image=rs.getString(7);
                    // Add row to table
                    out.println("<img src = 'Images/"+image+"' width='200' height='200'>");
                    out.println("<tr><td>" + email + "</td>" +
                            "<td>" + nameL + "</td>"+
                            "<td>"+ password + "</td>" +
                            "<td>" + city + "</td>" +

                            "</tr>");

                }

                // End table
                out.println("</table>");

            }
            catch (SQLException e) {
                System.out.println(e);
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }


            out.println("<a href ='Logout'>logout</a>");
            out.println("<br>"); }


    }


}


