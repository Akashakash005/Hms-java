package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PatientDao;
import service.PatientService;
import bean.Patient;



/**
 * Servlet implementation class PatientUpdateServlet
 */
@WebServlet("/PatientUpdateServlet")
public class PatientUpdateServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String roomNumber = request.getParameter("Patient_room_no");
		String weightParam = request.getParameter("Patient_weight");
		String heightParam = request.getParameter("Patient_height");
		String ageParam = request.getParameter("Patient_age");
		String BloodGroup = request.getParameter("B_group");
		String date = request.getParameter("dob");
		String Gender = request.getParameter("gender");
		String City = request.getParameter("city");
		String doctorID = request.getParameter("doctor_id");
		String DoctorName = request.getParameter("doctor_name");
		String Address = request.getParameter("Address");
		String contactParam = request.getParameter("Contact");
		 
		int DoctorID = (doctorID != null && !doctorID.trim().isEmpty()) ? Integer.parseInt(doctorID.trim()) : -1;
		int RoomNumber = (roomNumber != null && !roomNumber.trim().isEmpty()) ? Integer.parseInt(roomNumber.trim()) : -1;
		int Age = (ageParam != null && !ageParam.trim().isEmpty()) ? Integer.parseInt(ageParam.trim()) : -1;
         int Height = (heightParam != null && !heightParam.trim().isEmpty()) ? Integer.parseInt(heightParam.trim()) : -1;
         int Weight = (weightParam != null && !weightParam.trim().isEmpty()) ? Integer.parseInt(weightParam.trim()) : -1;
         long ContactNumber = (contactParam != null && !contactParam.trim().isEmpty()) ? Long.parseLong(contactParam.trim()) : -1;

		Patient p = new Patient(id,firstName, lastName, email, RoomNumber, Weight, Height, Age, BloodGroup, date, Gender,
				City, DoctorID, DoctorName, Address, ContactNumber);

		// Update the patient details in the database
		PatientService ptservice = new PatientService();
		int status = 0;
		status = ptservice.updatePatient(p);

		if (status > 0) {
//			out.print(  " <font color=green> record added successfully </font>");
			request.setAttribute("message", " <font color=green> record added successfully </font>");

			request.getRequestDispatcher("update.jsp").forward(request, response);
		} else {
//			out.print(" <font color=red>problem while adding record </font>");
			request.setAttribute("message", " <font color=red> record not added successfully </font>");
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
	}
}
