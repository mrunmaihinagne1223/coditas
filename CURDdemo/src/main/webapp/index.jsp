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
	<h1>Hello World!</h1>
	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
<form action="loginpage" method="get"  >
<label for="first-name">email:</label>
<input type="text" id="first-name" name="first-name" required><br><br>
<label for="email">Email:</label>
<input type="email" id="email" name="email" required><br><br>
<label for="password">Password:</label>
<input type="password" id="password" name="password" required><br><br>




<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
</body>
</html>
