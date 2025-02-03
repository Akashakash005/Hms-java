<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>Login - XYZ Hospital</title>
<link rel="stylesheet" type="text/css" href="css/stylesh.css">
</head>
<body>
	<%@ include file = "navbar.jsp"%>

	<main>
		<div class="login-container">
		<%  if(request.getAttribute("check")!=null)
		out.println(request.getAttribute("check"));
	
	%>
			<h2>Login</h2>
			<form action="loginServlet" method="post" class="login-form">
				<div class="form-group">
					<label for="username">Username:</label> <input type="text"
						id="username" name="username" required>
				</div>
				<div class="form-group">
					<label for="password">Password:</label> <input type="password"
						id="password" name="password" required>

				</div>
				<div class="form-group">
					<button type="submit" value="Submit" >Login</button>

				</div>
				<div class="form-group">
					<a href="#">Forgot Password?</a>
				</div>
			</form>
		</div>
	</main>

	<%@ include file="footer.jsp"%>

</body>
</html>
