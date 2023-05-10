<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

</head>
<body>
	<h1>Customer Registration Page</h1>


    	<form action="editUser" method="get">
    	     <label for="id4">Customer ID:</label>
             <input type="text" id="id4" name="id4" required><br><br>

             <label for="username">name:</label>
             <input type="text" id="username" name="name" required><br><br>

    		<label for="username">Username:</label>
    		<input type="text" id="username" name="username" required><br><br>

    		<label for="password">Password:</label>

    		<input type="password" id="password" name="password" required><br><br>
    		<input type="submit" value="Register">


    	</form>
    	<form action="editUser" method="get">
    	<c:forEach var="crm" items="${crmList}">
            <label for="empId">Customer Id:</label>
            <input type="text" id="empId" name="id4" value="<c:out value="${crm.id}" />"><br><br>

            <label for="empName">Customer Name:</label>
            <input type="text" id="name" name="name" value="<c:out value="${crm.name}" />"><br><br>

            <label for="empEmail">Customer Username:</label>
            <input type="text" id="username" name="username" value="<c:out value="${crm.username}" />"><br><br>

            <label for="empPassword">Customer password:</label>
            <input type="password" id="password" name="password" value="<c:out value="${crm.password}" />"><br><br>

            <input type="submit" value="Save">
        </form>
</body>
</html>