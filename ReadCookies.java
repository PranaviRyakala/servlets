package deloitteweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ReadCookies")
public class ReadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Cookie cks[]=request.getCookies();
		for(int i=0;i<cks.length;i++)
		{
			out.println("cookie name="+cks[i].getName());
			out.println("cookie value="+cks[i].getValue()+"<br>");
		}
		HttpSession session =request.getSession();
		out.println(session.getAttribute("mobile"));
		session.invalidate();
	}

}
