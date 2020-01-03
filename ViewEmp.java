package deloitteweb;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;
@WebServlet("/ViewEmp")
public class ViewEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	EmpDao dao = new EmpDaoImpl();
	List<Emp> empls = dao.getEmpls();
	for(Emp e : empls)
	{	out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob()+" "+
		e.getMgr()+" "+e.getHiredate()+" "+e.getSal()+" "+e.getComm()+" "+
		e.getDeptno());
	out.println("<br>");
	}
	}

}
