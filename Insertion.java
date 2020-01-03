package deloitteweb;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;
@WebServlet("/Insertion")
public class Insertion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int empno=Integer.parseInt(request.getParameter("empno"));
		String name =request.getParameter("ename");
		String job=request.getParameter("job");
		int managerId=Integer.parseInt(request.getParameter("mgr"));
		String hireDate=request.getParameter("hiredate");
		int salary=Integer.parseInt(request.getParameter("sal"));
		int commission=Integer.parseInt(request.getParameter("comm"));
		int departmentNo=Integer.parseInt(request.getParameter("deptno"));
		Emp emp = new Emp(empno,name,job,managerId,hireDate,salary,commission,departmentNo);
		EmpDao dao = new EmpDaoImpl();
		int rows = dao.addEmp(emp);
		
		if(rows>0)
		{
		out.println("inserted<br>");
		out.println(empno+" "+name+" "+job+" "+managerId+" "+hireDate+" "+salary+" "+commission+" "+departmentNo);
		}
		else
			System.out.println("not inserted");
		
	}

}
