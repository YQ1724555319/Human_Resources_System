package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountSalary extends HttpServlet {

	public CountSalary() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String countBegin = request.getParameter("countBegin");
		String countEnd = request.getParameter("countEnd");
		int totalAttendance =Integer.parseInt(request.getParameter("totalAttendance"));
		String onWorkTime = request.getParameter("onWorkTime");
		String offWorkTime = request.getParameter("offWorkTime");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void init() throws ServletException {
		// Put your code here
	}

}
