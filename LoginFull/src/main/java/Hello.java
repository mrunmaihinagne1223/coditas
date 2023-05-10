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
import javax.servlet.http.HttpSession;

@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		String name="";
		ServletContext sr = getServletContext();
		int cnt=0;
		try {
			Class.forName(sr.getInitParameter("driver"));
			Connection con = DriverManager.getConnection(sr.getInitParameter("url"), sr.getInitParameter("username"), sr.getInitParameter("password"));
            out.println("JDBC Connection Done");
			out.println("<br>");
			out.println("<br>");
			Statement st = con.createStatement();
			ResultSet rs =st.executeQuery("select*from userRes");
			out.println("RS working");
			while (rs.next()){
				String un =rs.getString(2);
				String pd=rs.getString(3);
				if(uname.equals(un) && pd.equals(pd)){
					un=name;
					System.out.println(un);
					cnt++;
					break;

				}

			}
			if(cnt==0){
				out.println("Try again");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.html");
				requestDispatcher.include(request,response);

			}
			else {
				HttpSession session=request.getSession();
				session.setAttribute("uname",uname);
				response.sendRedirect("Welcome");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
