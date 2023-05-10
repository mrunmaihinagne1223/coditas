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
	<div class="container">
          <h1>Login Page</h1>
          <form action="regestrtion.jsp" method="get">
             <button class="btn btn-primary" type="submit">Admin login</button>
          </form>
          <br>
          <form action="login.jsp" method="get">
             <button class="btn btn-primary" type="submit">Customer login</button>
          </form>
       </div>
</body>
</html>
