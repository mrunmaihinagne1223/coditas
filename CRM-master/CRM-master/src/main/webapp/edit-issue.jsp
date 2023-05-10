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

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="card">
                <div class="card-header">Update Issue</div>
                <div class="card-body">
                    <form action="updateIssue" method="post">
                        <input type="hidden" name="id" value="${issue.issue_id}" />
                        <input type="hidden" name="uid" value="${issue.user.u_id}" />

                        <div class="form-group">
                            <label for="user">User:</label>
                            <input type="hidden" id="user" name="user" value="${issue.user.u_name}" />
                            <p class="form-control-static">${issue.user.u_name}</p>
                        </div>

                        <div class="form-group">
                            <label for="issueType">Issue Type:</label>
                            <input type="text" id="issueType" name="issueType" class="form-control" value="${issue.issue_type}" />
                        </div>

                        <div class="form-group">
                            <label for="description">Description:</label>
                            <textarea id="description" name="description" class="form-control">${issue.description}</textarea>
                        </div>

                        <div class="form-group">
                            <label for="today">Reported Date :</label>
                            <input type="hidden" id="today" name="today" class="form-control" value="${issue.today}" />
                            <p><c:out value="${issue.today}"/></p>
                        </div>

                        <div class="form-group">
                            <label for="deadline">Deadline:</label>
                            <input type="date" id="deadline" name="deadline" class="form-control" value="${issue.deadline}" />
                        </div>

                        <div class="form-group">
                            <label for="status">Status:</label>
                            <select id="status" name="status" class="form-control">
                                <option value="Assigned" <c:if test="${issue.status == 'Assigned'}">selected</c:if>>Assigned</option>
                                <option value="In Progress" <c:if test="${issue.status == 'In Progress'}">selected</c:if>>In Progress</option>
                                <option value="Resolved" <c:if test="${issue.status == 'Resolved'}">selected</c:if>>Resolved</option>
                            </select>
                        </div>

                        <div class="form-group">
                            <button type="submit" class="btn btn-primary">Update Issue</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
