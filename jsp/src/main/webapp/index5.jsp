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
	<h1>GREETING PAGE</h1>
	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
    <form action="welcome2.jsp" method="get">
    ID:
    <input type="text" name="id">
    fname:
    <input type="text" name="fname">
     lname:
        <input type="text" name="lname">
    <input type="submit" value="go"><br/>
    Current Time: <%= java.util.Calendar.getInstance().getTime() %>
    <%! int data=50; %>
    <%= "Value of the variable is:"+data %>
</body>
</html>
