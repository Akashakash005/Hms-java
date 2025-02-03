<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>Registration - XYZ Hospital</title>
<link rel="stylesheet" type="text/css" href="css/stylesh.css">
</head>
<body>
	<%@ include file="navbar.jsp"%>

	<main>
	<%  if(request.getAttribute("message")!=null)
		out.println(request.getAttribute("message"));
	
	%>
	
		<div class="registration-form">
			<h1>Patient Registration Form</h1>

			<form class="registrationForm" method="post"
				action="<%=application.getContextPath()%>/PatientRegistrationServlet">


				<div class="form-group">
					<label for="firstname">First Name: </label> <input type="text"
						id="firstname" name=firstname required>
				</div>
				<div class="form-group">
					<label for="lastname">Last Name: </label> <input type="text"
						id="lastname" name="lastname" required>
				</div>

				<div class="form-group">
					<label for="email">Email ID:</label> <input type="email" id="email"
						name="email" required>
					<div class="error" id="emailError"></div>
				</div>

				<div class="form-group">
					<label for="Patient_room_no">Room Number: </label> <input
						type="text" id="Patient_room_no" name="Patient_room_no" required>
				</div>


				<div class="form-group">
					<label for="Weight">Weight: </label> <input type="text"
						id="Patient_weight" name="Patient_weight" required>
				</div>

				<div class="form-group">
					<label for="Height">Height: </label> <input type="text"
						id="Patient_height" name="Patient_height" required>
				</div>

				<div class="form-group">
					<label for="Patient_age">Age: </label> <input type="text"
						id="Patient_age" name="Patient_age" required>
				</div>


				<div class="form-group">
					<label for="B_group">Blood Group: </label> <select id="B_group"
						name="B_group" required>
						<option value="">Select Blood group</option>
						<option value="B+">B +ve</option>
						<option value="B-">B -ve</option>
						<option value="A+">A +ve</option>
						<option value="A-">A -ve</option>
						<option value="AB+">AB +ve</option>
						<option value="AB-">AB -ve</option>
					</select>

					<div class="form-group">
						<label for="dob">DOB: </label> <input type="text" id="dob"
							name="dob" required>
					</div>

					<div class="form-group">
						<label for="Patient_gender">Gender:</label> <select id="Patient_gender"
							name="Patient_gender" required>
							<option value="">Select Gender</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
							<option value="Other">Other</option>
						</select>
						<div class="error" id="genderError"></div>
					</div>

					<div class="form-group">
						<label for="city">city: </label> <input type="text" id="city"
							name="city" required>
					</div>

					<div class="form-group">
						<label for="doctor_id">doctor_id: </label> <input type="text"
							id="doctor_id" name="doctor_id" required>
					</div>

					<div class="form-group">
						<label for="doctor_name">doctor Name: </label> <input type="text"
							id="doctor_name" name="doctor_name" required>
					</div>




				</div>

				<div class="form-group">
					<label for="Address">Address: </label> <input type="text"
						id="Address" name="Address" required>
				</div>

				<div class="form-group">
					<label for="Contact">Contact</label> <input type="text"
						id="Contact" name="Contact" required>
				</div>

				<div class="form-group">
					<button type="submit" value="Submit">Submit</button>

				</div>

			</form>
	</main>


	<%@ include file="footer.jsp"%>
	
</body>
</html>
