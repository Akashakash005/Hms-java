package controller;
import service.PatientService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Patient;



/**
 * Servlet implementation class PatientRegistrationServlet
 */
@WebServlet("/PatientRegistrationServlet")
public class PatientRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		int RoomNumber=Integer.parseInt(request.getParameter("Patient_room_no"));
		int Weight =Integer.parseInt(request.getParameter("Patient_weight")) ;
		int Height = Integer.parseInt(request.getParameter("Patient_height")) ;
		int Age = Integer.parseInt(request.getParameter("Patient_age")) ;
		String BloodGroup = request.getParameter("B_group");
		String date =request.getParameter("dob");
		String Gender = request.getParameter("Patient_gender");
		String City = request.getParameter("city");
		int DoctorID =  Integer.parseInt(request.getParameter("doctor_id")) ;
		String DoctorName = request.getParameter("doctor_name");
		String Address = request.getParameter("Address");
		long ContactNumber = Long.parseLong(request.getParameter("Contact")) ;
		
//		Patient p = new Patient();
//		
//		long id = Patient.getRegistrationID();
		
		
		Patient p=new Patient(firstName,lastName,email,RoomNumber,Weight,Height,Age,BloodGroup,
				date,Gender,City,DoctorID,DoctorName,Address,ContactNumber);
		
		PatientService ptservice=new PatientService();
		int status = 0;
		try {
			status = ptservice.registerpatient(p);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(status>0) {
//			out.print(  " <font color=green> record added successfully </font>");
			request.setAttribute("message", " <font color=green> record added successfully </font>");
			
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}
		else {
//			out.print(" <font color=red>problem while adding record </font>");
			request.setAttribute("message", " <font color=red> record not added successfully </font>");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
		}
		
		
		
	}

}
