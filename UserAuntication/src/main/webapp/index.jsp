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
	<h1>LOGIN PAGES</h1>
    <form class="" action="login" method="get">
      UserName:
      <input type="text" name="uname" value="">
      PassWord:
      <input type="text" name="pwd" value=""><br>
      <input type="submit" name="" value="submit">
        <input type="reset" name="reset">




	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
</body>
</html>
