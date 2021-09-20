<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h3>Course selection:</h3>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<a href="/courses/newcourse">Add course</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table border="2" width="70%" cellpadding="2">
			        <tr>
			            <th>Id</th>
			            <th>Name</th>
			            <th>Description</th>
			            <th>Fee</th>
			            <th>Resources</th>
			        </tr>
			        <c:forEach var="course" items="${courses}">
			            <tr>
			                <td>${course.id}</td>
			                <td>${course.name}</td>
			                <td>${course.description}</td>
			                <td>${course.fee}</td>
			                <td><a href="${course.resource}">Resource</a></td>
			                <td><a href="/updatecourse/${course.id}">Update</a></td>
			                <td><a href="/deletecourse/${course.id}">Delete</a></td>
			            </tr>
			        </c:forEach>
			    </table>
			</div>
		</div>
	</div>

</body>
</html>