package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 * Servlet implementation class Summery
 */
@WebServlet("/Summery")
public class Summery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Summery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
       HttpSession httpSession=request.getSession(false);
		
		if(httpSession !=null)
		{
			
			
			User u=(User)httpSession.getAttribute("user");
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setCity(request.getParameter("city"));
			
			
			PrintWriter out=response.getWriter();
			out.println("<h2> Hello "+u.getEmail()+"<h2>");
			out.println("<h2> Detail "+u+"<h2>");
			out.println("<h2> Session Id "+httpSession.getId()+"<h2>");
			out.println("<h2> Session Creatation time "+httpSession.getCreationTime()+"<h2>");
			httpSession.invalidate();
			
			
		}
		
		
	}

}
