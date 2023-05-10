<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	<h1>REGRSTRION</h1>
	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
    <% out.println("Hello "+request.getParameter("uname")); %>

    <br>
    <%= "Welcome "+request.getParameter("uname") %>
    <br>

    <%!
    int cube(int n){
    return n*n*n;
    }
    %>

    <%= "Cube of 3 is:"+cube(3) %>
    <%--response.sendRedirect("http://www.google.com");--%>

    <br>
    <%
    String driver=application.getInitParameter("dname");
    out.println("driver name is="+driver);
    %>

    <br>
    <% String name1=request.getParameter("uname");
    session.setAttribute("user",name1);
    %>
    <br>
    SET values in session:
    <br>
    <a href="second.jsp">next</a>

    <br>
    SET values in pageContext:
    <br>
    <% String name3=request.getParameter("uname2");
       pageContext.setAttribute("userp",name3,PageContext.APPLICATION_SCOPE);
     %>
     <a href="second.jsp">Upnext</a>

</body>
</html>
