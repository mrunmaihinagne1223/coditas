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

@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
		int cnt=0;
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
        ServletContext sr = getServletContext();


		try {
			Class.forName(sr.getInitParameter("driver"));
			Connection con =DriverManager.getConnection(sr.getInitParameter("url"),sr.getInitParameter("username"),sr.getInitParameter("password"));
		    out.println("JDBC Connection Done");
			out.println("<br>");
			out.println("<br>");
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(" select*from user");
			while (resultSet.next()){
				String un=resultSet.getString(1);
				String pd=resultSet.getString(2);
				if(un.equals(name) && pd.equals(pwd)){
					out.println("Welcome : "+name);
					cnt++;
					//If Authitication is done then you have add table in that
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select*from student");
					out.println("<table border = '1'>");
					out.println("<tr><th>ID<th><th>User<th></tr>");
					while (rs.next()){
						String id =rs.getString(1);
						String na = rs.getString(2);
						out.println("<tr><td>"+id+"</td><td>"+na+"</td></tr>");
					}
					out.println("</table>");
					break;

				}

			}
			if(cnt==0){
				out.println("Try again");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.html");
				requestDispatcher.include(request,response);
			}
			out.println("<br>");
			out.println("<form action='bye'>");
			out.println("<button type='submit'>Next</button>");
			out.println("</form>");


		}
		 catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		out.println(" <h3> <a href='Coditas'> Coditas </a></h3>");


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
