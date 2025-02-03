<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Patient" %>
<%@ page import="controller.ViewPatientServlet" %>
<%@ page import="controller.PatientUpdateServlet" %>
<%@ page import="service.PatientService" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Patient Records</title>
    <link rel="stylesheet" type="text/css" href="css/stylesh.css">
</head>

<body>
    <%@ include file="dashboardnavbar.jsp" %>

    <main>
        <div class="logout">
            <a href="home.html">
                <button onclick="log-out">Logout</button>
            </a>
        </div>
        <% if( request.getAttribute("message")!=null){
			out.println(request.getAttribute("message"));
			
		}%>
        <h2>Update Patient Records</h2> 
            <form class="check-form" action="ViewPatientServlet" method="get">
                <label for="Patient_id">Patient ID: </label>
                <input type="text" name="Patient_id" id="Patient_id" placeholder="Patient ID">
                   <input type="hidden" name="action" value="update">
               
                <input type="submit" value="Search">
                
            </form>
		
        <div class="registration-form">
           
            <%
                // Retrieve patient data if available
                Patient patient = null;
                ArrayList<Patient> patientsList = (ArrayList<Patient>) request.getAttribute("patients");
                if (patientsList != null && !patientsList.isEmpty()) {
                    patient = patientsList.get(0);
                }
            %>

            <%
                if (patient != null) {
            %>
            <form class="registrationForm" action="PatientUpdateServlet" method="post">
               
                <div class="form-group">
                    <label for="Patient_name">Registration Id:</label>
                     <input type="text" name="id" id="Patient_id" value="<%= patient.getId() %>" >
                </div>
                
                <div class="form-group">
					<label for="firstname">First Name: </label> <input type="text"
						id="firstname" name=firstname value="<%= patient.getFirstName() %>" disabled>
				</div>
				<div class="form-group">
					<label for="lastname">Last Name: </label> <input type="text"
						id="lastname" name="lastname" value="<%= patient.getLastName() %>" disabled>
				</div>

				<div class="form-group">
					<label for="email">Email ID:</label> <input type="email" id="email"
						name="email" value="<%= patient.getEmail() %>" required>
					<div class="error" id="emailError"></div>
				</div>

				<div class="form-group">
					<label for="Patient_room_no">Room Number: </label> <input
						type="text" id="Patient_room_no" name="Patient_room_no" value="<%= patient.getRoomNumber() %>" required>
				</div>


				<div class="form-group">
					<label for="Weight">Weight: </label> <input type="text"
						id="Patient_weight" name="Patient_weight" value="<%= patient.getWeight() %> "required>
				</div>

				<div class="form-group">
					<label for="Height">Height: </label> <input type="text"
						id="Patient_height" name="Patient_height" value="<%= patient.getHeight() %> " required>
				</div>

				<div class="form-group">
					<label for="Patient_age">Age: </label> <input type="text"
						id="Patient_age" name="Patient_age" value="<%= patient.getAge() %> "required>
				</div>


				  <div class="form-group">
                    <label for="B_group">Blood Group: </label>
                    <select id="B_group" name="B_group" disabled>
                        <option value="B+" <%= "B+".equals(patient.getBloodGroup()) ? "selected" : "" %>>B +ve</option>
                        <option value="B-" <%= "B-".equals(patient.getBloodGroup()) ? "selected" : "" %>>B -ve</option>
                        <option value="A+" <%= "A+".equals(patient.getBloodGroup()) ? "selected" : "" %>>A +ve</option>
                        <option value="A-" <%= "A-".equals(patient.getBloodGroup()) ? "selected" : "" %>>A -ve</option>
                        <option value="AB+" <%= "AB+".equals(patient.getBloodGroup()) ? "selected" : "" %>>AB +ve</option>
                        <option value="AB-" <%= "AB-".equals(patient.getBloodGroup()) ? "selected" : "" %>>AB -ve</option>
                    </select>
                </div>

					<div class="form-group">
						<label for="dob">DOB: </label> <input type="text" id="dob"
							name="dob" value="<%= patient.getDOB() %> " required>
					</div>

					<div class="form-group">
                    <label for="gender">Gender:</label>
                    <select id="gender" name="gender" disabled>
                        <option value="Male" <%= "Male".equals(patient.getGender()) ? "selected" : "" %>>Male</option>
                        <option value="Female" <%= "Female".equals(patient.getGender()) ? "selected" : "" %>>Female</option>
                        <option value="Other" <%= "Other".equals(patient.getGender()) ? "selected" : "" %>>Other</option>
                    </select>
                </div>

					<div class="form-group">
						<label for="city">city: </label> <input type="text" id="city"
							name="city" value="<%= patient.getCity() %> " required>
					</div>

					<div class="form-group">
						<label for="doctor_id">doctor_id: </label> <input type="text"
							id="doctor_id" name="doctor_id" value="<%= patient.getDoctorID() %> " disabled>
					</div>

					<div class="form-group">
						<label for="doctor_name">doctor Name: </label> <input type="text"
							id="doctor_name" name="doctor_name" value="<%= patient.getDoctorName() %> " disabled>
					</div>
                
                
                
                
                
                
                
               
                <div class="form-group">
                    <label for="Address">Address: </label>
                    <input type="text" id="Address" name="Address" value="<%= patient.getAddress() %>" required>
                </div>

                <div class="form-group">
                    <label for="Contact">Contact: </label>
                    <input type="text" id="Contact" name="Contact" value="<%= patient.getContactNumber() %>" required>
                </div>

                <div class="form-group">
                    <button type="submit" value="Submit">Submit</button>
                </div>
            </form>
            <%
                } else {
            %>
            <p>No patient details found. Please search for a patient.</p>
            <%
                }
            %>
        </div>
    </main>

    <%@ include file="footer.jsp" %>
</body>

</html>
