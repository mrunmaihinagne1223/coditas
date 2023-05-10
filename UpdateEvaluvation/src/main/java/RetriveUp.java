import javax.servlet.RequestDispatcher;
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/RetriveUp")
public class RetriveUp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        ServletContext context = getServletContext();
        int rid= Integer.parseInt(req.getParameter("id4"));
        int id=0;
        String name = "";
        String email = "";
        String pass = "";
        String city ="";
        String phone = "";
        try {
            Class.forName(context.getInitParameter("driver"));
            Connection con = DriverManager.getConnection(context.getInitParameter("url"), context.getInitParameter("username"), context.getInitParameter("password"));
            PreparedStatement ps = con.prepareStatement(" select*from backup where id=?");
            ps.setInt(1,rid);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
                id=rs.getInt(1);
                name = rs.getString(2);
                email = rs.getString(3);
                pass = rs.getString(4);
                city = rs.getString(5);
                phone = rs.getString(6);

            }
            out.println("SElected");
            out.println(id);
            out.println(city);
            PreparedStatement ps1 = con.prepareStatement("insert into users (id,name,email,password,city,phone)values(?,?,?,?,?,?)");
            ps1.setInt(1,id);
            ps1.setString(2,name);
            ps1.setString(3,email);
            ps1.setString(4,pass);
            ps1.setString(5,city);
            ps1.setString(6,phone);
            ps1.executeUpdate();
            out.println("Inserted");
            RequestDispatcher rd = req.getRequestDispatcher("adminPage");
            rd.forward(req,resp);





        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
