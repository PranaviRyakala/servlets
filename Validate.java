package deloitteweb;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		RequestDispatcher rd = null;
		HttpSession session=request.getSession();
		if(user.equals("admin") && password.equals("admin") )
			{
	
			session.setAttribute("admin", user);
			session.setAttribute("admin", password);
			rd=request.getRequestDispatcher("Admin");
			//response.sendRedirect("Admin");
		out.println("success");
			
			}
		else if(user.equals("admin") &&(password.isEmpty()|| !(password.equals("admin")))){			
			out.println("<font color=red>password should not be empty</font>");
			rd=request.getRequestDispatcher("Form.html");
		}
		else if (user.isEmpty() || password.isEmpty() )
		{
			out.println("<font color=red>name/password should not be empty</font>");
			rd=request.getRequestDispatcher("Form.html");
		}			
		else
			{rd=request.getRequestDispatcher("User");
			out.println("success");
			}
		rd.include(request, response);
			
		
	}

}
