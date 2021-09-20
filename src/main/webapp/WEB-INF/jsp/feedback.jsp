<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Check our courses reviews</h2>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<a href="/feedback/addfeedback">Add feedback</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table border="2" width="70%" cellpadding="2">
			        <tr>
			            <th>Id</th>
			            <th>Name</th>
			            <th>Email</th>
			            <th>Feedback</th>
			            <th>User</th>
			        </tr>
			        <c:forEach var="feedback" items="${feedbacks}">
			            <tr>
			                <td>${feedback.id}</td>
			                <td>${feedback.name}</td>
			                <td>${feedback.email}</td>
			                <td>${feedback.feed}</td>
			                <td>${feedback.userId}</td>
			                <td><a href="/updatefeedback/${feedback.id}">Update</a></td>
			                <td><a href="/deletefeedback/${feedback.id}">Delete</a></td>
			            </tr>
			        </c:forEach>
			    </table>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<a class="btn btn-primary" href="/home">Home</a>
			</div>
		</div>
	</div>

</body>
</html>