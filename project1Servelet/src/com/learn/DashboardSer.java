package com.learn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DashboardSer
 */
public class DashboardSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String act = request.getParameter("action");
		if (act == null) {
		    //no button has been selected
		} else if (act.equals("Insert")) {
		   response.sendRedirect("studentreg.html");
		} else if (act.equals("Select")) {
			 response.sendRedirect("showstudentlist.html");
		
	    } else if (act.equals("Update")) {
	    	 response.sendRedirect("updatestudent.html");
	} else if (act.equals("Delete")) {
		 response.sendRedirect("deletestudent.html");
	} 
		else {
		    //someone has altered the HTML and sent a different value!
		}
	}

}
