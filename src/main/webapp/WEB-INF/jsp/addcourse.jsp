<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Course</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Register new course</h2>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<form method="post" action="/courses/add">
					<pre>
						Name:<input name="name" type="text"/><br>
						Description:<input name="description" type="text"/><br>
						Fee:<input name="fee" type="number" /><br>
						Resources link:<input name="resource" type="text" /><br>
									<input type="submit" value="Submit" ><br>
					</pre>
				</form>
			</div>
		</div>
	</div>

</body>
</html>