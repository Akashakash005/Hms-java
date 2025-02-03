package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
//		int status=0;
//		if(username=="admin123" && password=="Admin@123") {
//			status=1;
//			
//		}
		if(username.equals("admin123") && password.equals("Admin@123")) {
//			out.print(  " <font color=green> record added successfully </font>");
			
			
			request.getRequestDispatcher("dashboard.jsp").forward(request, response);;
			
		}
		else {
//			out.print(" <font color=red>problem while adding record </font>");
			request.setAttribute("check"," <font color=red>check the username/ password </font>" );
			request.getRequestDispatcher("loginhospital.jsp").forward(request, response);
		}
		
	}

}
