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
	<h1> Addition</h1>
	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
    <%
    String name=(String)session.getAttribute("user");
    out.print("Set by session "+name);
    %>
    <a href="logout.jsp">logout</a>
    <br>
    <%
    String name3=(String)pageContext.getAttribute("userp",PageContext.APPLICATION_SCOPE);
    out.print("Set in pageContext "+name3);
    %>
 </body>
</html>
