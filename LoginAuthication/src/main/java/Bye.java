import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/bye")
public class Bye extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("uname");
        out.println("BYE : "+null ); // NULL
       // out.println(" <a href='index.html'> Logout </a>");
        out.println("<form action='index.html'>");
        out.println("<button type='submit'>logout</button>");
        out.println("</form>");

        HttpSession session = req.getSession(false);
        if(session != null) {
            session.invalidate();
        }
    }
}
