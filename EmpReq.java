package deloitteweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpReq")
public class EmpReq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String empname=request.getParameter("empname");
		String emailId=request.getParameter("emailId");
		String doj=request.getParameter("doj");
		String[] jobs=request.getParameterValues("jobs");
double salary=Double.parseDouble(request.getParameter("salary"));
		out.println("Employee name="+" "+empname+"<br>");
		out.println("Employee email="+" "+emailId+"<br>");
		out.println("Employee doj="+" "+doj+"<br>");
		for(String value:jobs)
		out.println("Employee job="+" "+value+"<br>");
		out.println("Employee Salary"+ " "+salary+"<br>");
		out.println(request.getPathInfo()+"<br>");
		out.println(request.getCharacterEncoding()+"<br>");
		out.println(request.getRequestURI()+"<br>");
		out.println(request.getRequestURL()+"<br>");
		out.println(response.getClass()+"<br>");
		out.println(request.getRemoteHost()+"<br>");
		out.println(response.getBufferSize()+"<br>");
		out.println(response.getLocale());
		
	
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
