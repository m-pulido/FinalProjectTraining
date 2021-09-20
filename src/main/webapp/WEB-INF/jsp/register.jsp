<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<title>Registration</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Registration Form</h2>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<form method="post" action="/register/newuser">
					<pre>
						Username:	<input name="name" type="text"/><br>
						Email:		<input name="email" type="text"/><br>
						Phone:		<input name="phoneNumber" type="number" /><br>
						Address:	<input name="address" type="text" /><br>
						Password:	<input name="password" type="password" /><br>
									<input type="submit" value="Submit" >
					</pre>
				</form>
			</div>
		</div>
	</div>
</body>
</html>