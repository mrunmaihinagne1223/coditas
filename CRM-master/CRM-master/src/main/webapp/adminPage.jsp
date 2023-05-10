<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>

    <style>
    		.btn-primary {
    			background-color: #ADD8E6;
    			border-color: #ADD8E6;
    		}
    	</style>
  </head>
  <body>

     	<header>
        		<nav class="navbar navbar-expand-md navbar-dark bg-primary">
        			<div class="container">
						<h3 class="navbar-brand mb-0">Customer Relation Manager</h3>
						<ul class="navbar-nav mr-auto">
							<li class="nav-item">
								<a class="nav-link" href="LogoutServlet">Logout</a>
							</li>
						</ul>
        			</div>
        		</nav>
		</header>

        	<main class="container mt-5">
        		<div class="row justify-content-center">
        			<div class="col-lg-3 col-md-6">
        				<a href="CrmForm.jsp" class="btn btn-primary btn-block mb-3">Add CRM</a>
        			</div>
        			<div class="col-lg-3 col-md-6">
        				<form action="listCrm" method="post">
        					<button type="submit" class="btn btn-primary btn-block">All CRM</button>
        				</form>
        			</div>
        			<div class="col-lg-3 col-md-6">
                          <form action="listAllUsers" method="post">
                             <button type="submit" class="btn btn-primary btn-block">All Users</button>
                           </form>
                    </div>
                    <div class="col-lg-3 col-md-6">
                          <form action="listAllIssuesAdmin" method="post">
                             <button type="submit" class="btn btn-primary btn-block">All Pending Issues</button>
                          </form>
                    </div>
        		</div>
        	</main>

        	<!-- Bootstrap JS -->
        	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

  </body>
</html>
