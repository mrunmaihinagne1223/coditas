import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminPage")
public class  AdminPage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("In admin");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
        requestDispatcher.include(request, response);
        Conectivity con = (Conectivity) Conectivity.connection();
        System.out.println("JDBC ");
        out.println("<a href ='AdminPage'>addStudent</a>");
        out.println("<a href ='AdminPage'>deleteStudent</a>");



    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}