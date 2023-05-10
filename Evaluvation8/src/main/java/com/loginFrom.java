package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/loginFrom")
public class loginFrom extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        int cnt1 =0;
        String name = "";
        int Id = 0;
        String email = req.getParameter("email");
        String pwd = req.getParameter("password");
        ServletContext sr = getServletContext();
        if(email.equals("admin@1") && pwd.equals("12"))
        {
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("UserServlet");
            requestDispatcher.forward(req,resp);

        }
        else {
            try {
                Class.forName(sr.getInitParameter("driver"));
                Connection con = DriverManager.getConnection(sr.getInitParameter("url"), sr.getInitParameter("username"), sr.getInitParameter("password"));
                out.println("JDBC Connection Done");
                out.println("<br>");
                out.println("<br>");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select email,password,name,id from users");
                int cout = 0;
                while (rs.next()) {
                    String un = rs.getString(1);
                    String ps = rs.getString(2);


                    if (un.equals(email) && ps.equals(pwd)) {
                        name = rs.getString(3);
                        Id=rs.getInt(4);
                        cout++;
                        break;
                    }

                }
                if (cout == 0 && cnt1 != 0) {
                    out.println("<h1>Invalid Credentials</h1>");
                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
                    requestDispatcher.include(req, resp);
                } else {
                    HttpSession session = req.getSession();
                    session.setAttribute("uname", name);
                    session.setAttribute("Id", Id);
                    resp.sendRedirect("studentPage");
                }


            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }

        }

    }
}

