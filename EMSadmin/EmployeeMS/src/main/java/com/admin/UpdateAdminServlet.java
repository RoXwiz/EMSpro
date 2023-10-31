package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateAdminServlet
 */
@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String username = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("pass2");
		
		boolean isTrue;
		
		isTrue = AdminDBUtil.updateAdminData(id,name, email, mobile, username, password);
		
		//Check db connect is success
		if(isTrue==true) {
			List<Admin> adiDetails = AdminDBUtil.validate(username, password);
			if(!adiDetails.isEmpty()) {				
				request.setAttribute("adiDetails", adiDetails);
				RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
				dis.forward(request, response);
			}
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Admin update unsuccessful');");
			out.println("location='useraccount.jsp'");
			out.println("</script>");
		}
	}
}
