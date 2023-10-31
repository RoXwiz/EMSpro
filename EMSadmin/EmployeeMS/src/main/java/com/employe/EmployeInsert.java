package com.employe;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeInsert
 */
@WebServlet("/EmployeInsert")
public class EmployeInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("mobile");
		String designation = request.getParameter("desg");
		String salary = request.getParameter("salary");		
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
		
		boolean isTrue;
		
		isTrue = EmployeDBUtil.insertemploye(name, email, phone, designation, salary, username, password);
		
		//Check db connect is success
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);	
			System.out.println("Expected true");
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Employee registration unsuccessful');");
			out.println("location='employeeinsert.jsp'");
			out.println("</script>");
		}
		
		
	}

}
