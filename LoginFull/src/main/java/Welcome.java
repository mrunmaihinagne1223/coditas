import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setContentType("text/html");
        HttpSession session=req.getSession(false);
        PrintWriter out = resp.getWriter();
        String name = (String) session.getAttribute("uname");
//        Cookie c[]=req.getCookies();
        out.println("WELCOME : "+name);



        out.println("<a href ='index.html'>back</a>");
            out.println("<a href ='Logout'>logout</a>");

    }
}
