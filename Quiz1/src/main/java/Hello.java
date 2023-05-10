import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Enumeration;
import java.util.Stack;

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
		PrintWriter out = response.getWriter();
		ServletContext sr = getServletContext();
		int cnt=0;

		Enumeration paramName = request.getParameterNames();
		String ans="";

		try {
			Class.forName(sr.getInitParameter("driver"));
			Connection con = DriverManager.getConnection(sr.getInitParameter("url"),sr.getInitParameter("username"),sr.getInitParameter("password"));
			out.println("JDBC Connection Done");
			out.println("<br>");
			out.println("<br>");
			Statement st = con.createStatement();
			ResultSet rs =st.executeQuery("select ans from quiz");
			System.out.println("1");
			while (rs.next()&& paramName.hasMoreElements()){
				String un = rs.getString(1);
				String paraname= (String) paramName.nextElement();
                String parameterValues[]=request.getParameterValues(paraname);
				for(int i=0;i<parameterValues.length;i++){
					ans=parameterValues[i];
					System.out.println("1");
				}
				if(ans.equals(un)){
					cnt++;
					out.println(cnt);
				}

			}
			out.println("<h1>Score is "+cnt+"/3 </h1>");
			out.println("<br><br><a href='index.html'>Back</a>");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
