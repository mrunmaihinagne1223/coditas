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
  </header><br><br><br>

	<div class="row">


		<div class="container">


			<h3 class="text-center">History</h3>
			<hr>

			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
                        <th>Issue Id </th>
					    <th>User Id </th>
					    <th>User Name </th>
						<th>Issue Type</th>
						<th>Description</th>
						<th>Status</th>


					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="i" items="${issueList}">

						<tr>
						 <form action="updateStatus" method ="post">
						    <td><input type="hidden" name="id" value="${i.issue_id}" /><c:out value="${i.issue_id}" /></td>
							<td><c:out value="${i.user.u_id}" /></td>
							<td><c:out value="${i.user.u_name}" /></td>
							<td><c:out value="${i.issue_type}" /></td>
							<td><c:out value="${i.description}" /></td>
							<td><c:out value="${i.status}" /></td>





					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>





    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
