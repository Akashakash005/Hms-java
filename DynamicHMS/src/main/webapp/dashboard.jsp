<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet" type="text/css" href="css/stylesh.css">
</head>
<body>
	<%@ include file="dashboardnavbar.jsp"%>
	<main>

		<div class="logout">
			<a href="./home.html">
				<button onclick="log-out">logout</button>
			</a>
		</div>
		<h2>Dashboard</h2>
		<div class="dashboard-container">

			<p>Welcome, [User's Name]</p>
			<div class="dashboard-collection">
				<div class="dash-group">
					<label for="create">To create a patient details":</label> <a
						href="./registration.jsp">
						<button onclick="enterPatientDetails()">click here</button>
					</a>
				</div>


				<div class="dash-group">
					<label for="create">To view a patient details":</label>

					<button onclick="window.location.href='ViewPatientServlet';">Click
						Here</button>

					</a>
				</div>
				<div class="dash-group">
					<label for="create">To update a patient details":</label> <a
						href="./update.jsp">
						<button onclick="enterPatientDetails()">click here</button>
					</a>
				</div>
<div class="dash-group">
					<label for="create">To delete a patient details":</label> <a
						href="./delete.jsp">
						<button onclick="">click here</button>
					</a>
				</div>
				
			</div>

		</div>
		</div>
	</main>
	<%@ include file="footer.jsp"%>
	<script src="script.js"></script>

</body>
</html>