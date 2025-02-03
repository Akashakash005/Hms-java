package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.PatientDao;
import bean.Patient;
import service.PatientService;

@WebServlet("/ViewPatientServlet")
public class ViewPatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ViewPatientServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        PatientService ptService = new PatientService();

        String patientId = request.getParameter("Patient_id");
        ArrayList<Patient> patientsList = new ArrayList<>();

        if (patientId != null && !patientId.trim().isEmpty()) {
            try {
                int id = Integer.parseInt(patientId);
                Patient patient = ptService.getPatientById(id);
                if (patient != null) {
                    patientsList.add(patient);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            patientsList = ptService.getPatient();
        }

        request.setAttribute("patients", patientsList);
        
        // Determine which page to forward to, based on a parameter or other logic
        String action = request.getParameter("action");
        if ("update".equals(action)) {
            request.getRequestDispatcher("update.jsp").forward(request, response);
        } 
        else if("delete".equals(action)) {
            request.getRequestDispatcher("delete.jsp").forward(request, response);
        } 
        
        else {
            request.getRequestDispatcher("patient_details.jsp").forward(request, response);
        }
    }

}
