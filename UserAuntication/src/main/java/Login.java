import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login", initParams ={@WebInitParam(name ="Driver",value = "com.mysql.jdbc.Driver"),@WebInitParam(name="name",value = "\"jdbc:mysql://localhost:3306/userdb\"")})
public class Login extends HttpServlet {
    Connection con = Conectivity.connection();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int cnt =0;
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("uname");
        String  passward = req.getParameter("pwd");
//        ServletConfig config = getServletConfig();
//        String driver =config.getInitParameter("Driver");
//       out.println("Driver: "+driver);
//       String url = config.getInitParameter("name");
//       out.println("url: "+url);

        try {

          Statement statement = con.createStatement();
          ResultSet resultSet = statement.executeQuery(" select*from user");
          while (resultSet.next()){
              String un=resultSet.getString(1);
              String pd=resultSet.getString(2);
              if(un.equals(username) && pd.equals(passward)){
                  out.println("Welcome : "+username);

                  cnt++;
                  break;

              }

          }

         if(cnt>0) {
             Statement statement1 = con.createStatement();
             ResultSet rs = statement.executeQuery("select*from student");
             out.println("<table> <table border = solid>");
             while (rs.next()) {

                 out.println("<tr> <td>" + rs.getString(1) + "</td>" +
                         "<td> " + rs.getInt(2) + "</td> </tr>"
                 );
                 out.println("</table>");


             }


         }
         if(cnt==0){
             out.println("Invaild User");
         }
            out.println("<a herf = 'bye'> next</a>");

        } catch (SQLException e) {
            System.out.println(e);
        }




    }
}
