import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int x,y;
		String str ="";
		x=Integer.parseInt(request.getParameter("textfno"));
		y=Integer.parseInt(request.getParameter("textsno"));
		str=request.getParameter("operation");
		if(str.equals("add"))
			out.println("<h1> Result of addition is :"+(x+y)+"</h1>");
		else if(str.equals("sub"))
			out.println("<h1> Result of subration is :"+(x-y)+"</h1>");
		else if(str.equals("mul"))
			out.println("<h1> Result of multiplacation is :"+(x*y)+"</h1>");
		else if(str.equals("div"))
			out.println("<h1> Result of division is :"+(x/y)+"</h1>");
		else
			out.println("<h1> Result of modulous is :"+(x%y)+"</h1>");
		out.println("<a href=\"index.html\"> back</a>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
