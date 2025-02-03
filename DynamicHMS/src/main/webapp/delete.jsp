<%@ page import="bean.Patient"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.Date"%>
<%@ page import="java.text.*"%>
<%@ page import="controller.ViewPatientServlet.*" %>
<%@ page import="controller.DeletePatientServlet.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Patient Search</title>
<link rel="stylesheet" type="text/css" href="css/stylesh.css">
<style>
    table {
        margin: 0 auto; /* Center the table horizontally */
        width: 90%; /* Increase table width */
        border-collapse: collapse; /* Remove space between table borders */
    }
    th, td {
        text-align: center; /* Center-align the text */
        padding: 10px; /* Add padding for better spacing */
        width: auto; /* Auto width, you can adjust based on content */
    }
    th {
        background-color: #f2f2f2; /* Light gray background for headers */
    }
    td {
        background-color: #ffffff; /* White background for table data */
    }
</style>
</head>
<body>
    <%@ include file="navbar.jsp"%>

    <main>
     <% if( request.getAttribute("message")!=null){
			out.println(request.getAttribute("message"));
			
		}%>
       <h2>delete Patient Records</h2> 
            <form class="check-form" action="ViewPatientServlet" method="get">
                <label for="Patient_id">Patient ID: </label>
                <input type="text" name="Patient_id" id="Patient_id" placeholder="Patient ID">
            
                   <input type="hidden" name="action" value="delete">
               
                <input type="submit" value="Search">
            </form>

        
		
       

            <%
            ArrayList<Patient> arr = (ArrayList<Patient>) request.getAttribute("patients");
            int id=0;%>
            
            <form action="DeletePatientServlet" method="post">
          
            	 <table border=1>
                 <tr>
                     <th>ID</th>
                     <th>FIRSTNAME</th>
                     <th>LASTNAME</th>
                     <th>EMAIL</th>
                     <th>ROOMNUMBER</th>
                     <th>WEIGHT</th>
                     <th>HEIGHT</th>
                     <th>AGE</th>
                     <th>BLOODGROUP</th>
                     <th>DOB</th>
                     <th>GENDER</th>
                     <th>CITY</th>
                     <th>DOCTORID</th>
                     <th>DOCTORNAME</th>
                     <th>ADDRESS</th>
                     <th>CONTACT</th>
                 </tr>
                 <% if (arr != null && !arr.isEmpty()) { %>
               <%  for (Patient pt : arr) {
            	   
                    String regid = String.valueOf(pt.getId());
                    String age = String.valueOf(pt.getAge());
                    String Contact = String.valueOf(pt.getContactNumber());
                    String roomno = String.valueOf(pt.getRoomNumber());
                    String weight = String.valueOf(pt.getWeight());
                    String docid = String.valueOf(pt.getDoctorID());
                    String cont = String.valueOf(pt.getContactNumber());
                    String height = String.valueOf(pt.getHeight());
                    id=pt.getId();
            %>
            
            <tr>
            
                <td ><%=regid%></td>
                <td><%=pt.getFirstName()%></td>
                <td><%=pt.getLastName()%></td>
                <td><%=pt.getEmail()%></td>
                <td><%=roomno%></td>
                <td><%=weight%></td>
                <td><%=height%></td>
                <td><%=age%></td>
                <td><%=pt.getBloodGroup()%></td>
                <td><%=pt.getDOB()%></td>
                <td><%=pt.getGender()%></td>
                <td><%=pt.getCity()%></td>
                <td><%=docid%></td>
                <td><%=pt.getDoctorName()%></td>
                <td><%=pt.getAddress()%></td>
                <td><%=cont%></td>
              
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="16">No patient records found</td>
            </tr>
            <%
            }
            %>
        </table>
        <br>
         
          <input type="hidden" name="id" value="<%= id  %>">
          
          
        <input type="submit" value="Delete">
        <br>
       
        
        </form>
    </main>

    <%@ include file="footer.jsp"%>
</body>
</html>
