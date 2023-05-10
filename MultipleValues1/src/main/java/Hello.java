import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
		Enumeration em = request.getParameterNames();
		while (em.hasMoreElements()){
			String parmtr = (String) em.nextElement();
			out.println("<h1>"+parmtr+"</h1>");
			String []pvalues=request.getParameterValues(parmtr);
			if(pvalues.length==1){
				String singlevalue =pvalues[0];
				if(singlevalue.length()==0){
					out.println("NO VALUES");
				}
				else {
					out.println(singlevalue);
				}
			}
			else {
				 // Move the closing tag inside the loop
				out.println("I AM IN ELSE");
				for (int i = 0; i < pvalues.length; i++) {
					out.println(pvalues[i]);
				}
			}

			}

		}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
