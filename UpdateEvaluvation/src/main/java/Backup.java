import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
@WebServlet("/Backup")
public class Backup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext sr = getServletContext();

        try {
            Class.forName(sr.getInitParameter("driver"));
            Connection con = DriverManager.getConnection(sr.getInitParameter("url"), sr.getInitParameter("username"), sr.getInitParameter("password"));
            out.println("<h1>Backup</h1>");
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery("select*from backup");
            out.println("<table border='1'>");
            out.println("<tr><th>Email</th><th>name</th><th>password</th><th>city</th><th>city</th><th>Phone</th><th>Action</th></tr>");
            while (rs.next()){
                int id = rs.getInt("id");
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
                        "<td><a href='RetriveUp?id4="+id+"'>retrive</a></td>"+
                        "</tr>");
            }
            out.println("</table>");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
