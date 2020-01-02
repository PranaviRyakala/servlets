package deloitteweb;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleReq")
public class SampleReq extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("empname");
		int sal=Integer.parseInt(request.getParameter("sal"));
		out.println("Employee name="+" "+name+"<br>");
		out.println("Salary is "+sal);
		
	}
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	doGet(req,res);
}

}
