package deloitteweb;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession(false);
		  if (session != null)
		  {
		session.getAttribute("admin");
		out.println("Welcome Adminstrator");
		session.getAttribute("admin");
		out.println("Successfully logged in!");
		out.println("<a href=Form.html>Return to Login Page</a>");
		session.invalidate();
		  }
		  else{
			  out.println("Unauthorised access");
			  out.println("<a href=Form.html>Return to Login Page</a>");
		  }
		
	}

}
