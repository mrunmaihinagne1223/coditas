import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@MultipartConfig
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int cnt = 0;
		String name = request.getParameter("first-name");
		String pwd = request.getParameter("password");
		ServletContext sr = getServletContext();

		Part file = request.getPart("profile-image");
		String imageFileName = file.getSubmittedFileName();
		String uploadPath = "C:/Users/Coditas/IdeaProjects/ResistraionFrom/src/main/webapp/Images/"+imageFileName;

		FileOutputStream fs = new FileOutputStream(uploadPath);
		InputStream is = file.getInputStream();

		byte[] data = new byte[is.available()];
		is.read(data);
		fs.write(data);
		fs.close();



		try {
			Class.forName(sr.getInitParameter("driver"));
			Connection con = DriverManager.getConnection(sr.getInitParameter("url"), sr.getInitParameter("username"), sr.getInitParameter("password"));
			out.println("JDBC Connection Done");
			out.println("<br>");
			out.println("<br>");
			PreparedStatement ps = con.prepareStatement("insert into registration ( first_name,last_name, dob,email,password, profile_image, address, phone) values(?,?,?,?,?,?,?,?)");
			ps.setString(1, request.getParameter("first-name"));
			ps.setString(2, request.getParameter("last-name"));
			ps.setDate(3, Date.valueOf(request.getParameter("dob")));
			ps.setString(4, request.getParameter("email"));
			ps.setString(5, request.getParameter("password"));
			ps.setString(6,imageFileName);
			ps.setString(7, request.getParameter("address"));
			ps.setString(8, request.getParameter("phone"));
			ps.executeUpdate();

			RequestDispatcher requestDispatcher= request.getRequestDispatcher("login.html");
			out.println("Registered successfully");
			requestDispatcher.include(request,response);

//			out.println("Registered successfully");
//			out.println("<a href='login.html'>Login</a>");



		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}

}