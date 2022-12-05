package com.fly.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fly.dao.BookFlightDao;
import com.fly.pojo.BookedFlight;


/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
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
		response.setContentType("text/html");  
		
		
		
		
		
		BookedFlight c=new BookedFlight();
		PrintWriter out=response.getWriter();
		c.setName(request.getParameter("name"));
		c.setMobileNo(Long.parseLong(request.getParameter("mobile")));
		c.setEmail(request.getParameter("email"));
		
		response.sendRedirect("getFlightDetail.jsp");
		
		
		
		
		
		
		
//		CustomerDao dao=new CustomerDao();
//		int r=dao.insert(c);
//		
//		
//		if(r>0)
//		{
//			
//			
////			RequestDispatcher rd=request.getRequestDispatcher("getFlightDetail.jsp");
////			request.setAttribute("date", request.getParameter("date"));
////			request.setAttribute("person", request.getParameter("person"));
////			rd.forward(request, response);
//			
//			
////			  out.print("<form action='getFlightDetail.jsp' method='post'>");  
////		        out.print("<input type='hidden' name='date' value='"+request.getParameter("date")+"'>"); 
////		        out.print("<input type='hidden' name='person' value='"+request.getParameter("person")+"'>"); 
////		        out.print("<input type='submit' value='Confirm'>");  
////		        out.print("</form>");  
////		        out.close(); 
//		}
//		else {
//			response.sendError(0, "Registration fail");
//		}
//		
		
	}

}
