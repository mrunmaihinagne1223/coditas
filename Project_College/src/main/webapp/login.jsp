<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Home</title>

   <!-- Add Bootstrap CSS -->
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

   <style>
      /* Center the login form */
      .login-form {
         display: flex;
         flex-direction: column;
         align-items: center;
         margin-top: 50px;
      }
   </style>
</head>
<body>
   <div class="container">
      <nav class="navbar navbar-default" style="background-color:#0276ab;">
         <div class="container-fluid">
            <div class="navbar-header">

            </div>
            <ul class="nav navbar-nav">


            </ul>
            <marquee direction="left" scrollamount="10" style="color: white; font-size: 25px;">All INDIA SHRI SHIVAJI MEMORIAL  SOCIETY</marquee>

         </div>
      </nav>

      <div class="row">
         <div class="col-md-4 col-md-offset-4">
            <h1 class="text-center">Login Page</h1>

            <form method="get" action="login" class="login-form">
               <div class="form-group">
                  <label for="username">Username:</label>
                  <input type="text" class="form-control" id="username" name="username" required>
               </div>
               <div class="form-group">
                  <label for="password">Password:</label>
                  <input type="password" class="form-control" id="password" name="password" required>
               </div>
               <div class="form-group">
                  <button type="submit" class="btn btn-primary">Login</button>
                  <button type="reset" class="btn btn-default">Reset</button>
               </div>
            </form>

            <c:if test="${not empty param.name}">
               <p>Name: ${param.name}</p>
            </c:if>
         </div>
      </div>
   </div>

   <!-- Add Bootstrap JS -->
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
