import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
@MultipartConfig
@WebServlet("/Resgister")
public class Resgister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext sr = getServletContext();
		Part file = request.getPart("profile-image");
		String imageFileName = file.getSubmittedFileName();
		String uploadPath = "C:/Users/Coditas/IdeaProjects/UpdateEvaluvation/src/main/webapp/Image/"+imageFileName;

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
			PreparedStatement ps = con.prepareStatement("insert into users( name,email, password, city, phone , image) values(?,?,?,?,?,?)");
			ps.setString(1, request.getParameter("first-name"));
			ps.setString(2, request.getParameter("email"));
			ps.setString(3, request.getParameter("password"));
			ps.setString(4, request.getParameter("address"));
			ps.setString(5, request.getParameter("phone"));
			ps.setString(6,imageFileName);
			ps.executeUpdate();

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.html");
			out.println("Registered successfully");
			requestDispatcher.include(request, response);




		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}


	}
}

