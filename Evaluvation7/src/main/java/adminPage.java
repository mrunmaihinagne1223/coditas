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

@WebServlet("/adminPage")
public class adminPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("WELCOME ADMIN");
        ServletContext context = getServletContext();
        HttpSession session=req.getSession();
        int id = 0;
        try{
            Class.forName(context.getInitParameter("driver"));
            Connection con = DriverManager.getConnection(context.getInitParameter("url"),
                    context.getInitParameter("username"), context.getInitParameter("password"));

            PreparedStatement ps = con.prepareStatement("select*from users");
            ResultSet rs =ps.executeQuery();
            out.println("<table border='1'>");
            out.println("<tr><th>Email</th><th>name</th><th>password</th><th>city</th><th>city</th><th>Phone</th><th>Action</th><th>Action</th></tr>");
            while (rs.next()){
                 id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String city = rs.getString("city");
                String phone = rs.getString("phone");
                out.println("<tr><td>" + id + "</td>" +
                        "<td>"+ name + "</td>" +
                        "<td>" + email + "</td>" +
                        "<td>" + password + "</td>" +
                        "<td>" + city + "</td>" +
                        "<td>" + phone + "</td>" +
//                        "<td><a href='AdminEditing?id3="+id+"'>Edit</a></td>"+
//                        "<td><a href='AdminDeleting?id3="+id+"'>Delete</a></td>" +
                        "</tr>");



            }
            // End table
            out.println("</table>");
            out.println("<a href='AdminEditing?id3="+id+"'>Edit</a>");
//            "<td><a href='UpdateServlet?id3="+ids+"'>Update</a></td>");
//            out.println("<td><a href='DeleteServlet?id3="+ids+"'>Delete</a></td>");
        }
        catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }


        out.println("<a href ='Logout'>logout</a>");
        out.println("<a href ='Delete.html'>delete</a>");
        out.println("<a href ='Edit.html'>edit</a>");
       

        out.println("<br>"); }


}



