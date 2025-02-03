package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.PatientService;
import service.PatientService;

/**
 * Servlet implementation class DeletePatientServlet
 */
@WebServlet("/DeletePatientServlet")
public class DeletePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		PatientService ptService = new PatientService();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		int status = ptService.deletePatient(id);
		
		if (status > 0) {
//			out.print(  " <font color=green> record added successfully </font>");
			request.setAttribute("message", " <font color=green> record deleted successfully </font>");

			request.getRequestDispatcher("delete.jsp").forward(request, response);
		} else {
//			out.print(" <font color=red>problem while adding record </font>");
			request.setAttribute("message", " <font color=red> record not deleted successfully </font>");
			request.getRequestDispatcher("delete.jsp").forward(request, response);
		}
	}
	}


