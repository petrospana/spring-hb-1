package gr.hua.dit.ds.hb1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class teacher_register
 */
@WebServlet("/teacher_register")
public class teacher_register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String stathmos_id = request.getParameter("stathmos_id");
		
		if(first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || 
				password.isEmpty() || email.isEmpty() || stathmos_id.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("teacherRegister.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("register_2.jsp");
			req.forward(request, response);
		}
	}
 
}
