import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookies")
public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();


		try {
			if(request.getCookies()==null){
				out.println("NO Cookies Found");
				Cookie c = new Cookie("ID", "1");
				response.addCookie(c);


			}
			else {
				int noctr=0;
				Cookie[] all =request.getCookies();
				for (int i =0;i<all.length;i++){
					if(all[i].getName().equals("ID")){
						out.println(all[i].getValue());
						noctr++;
					}
				}


			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
