package com.fly.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fly.dao.AirLineDao;
import com.fly.pojo.Airline;

/**
 * Servlet implementation class AddAirLineController
 */
public class AddAirLineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAirLineController() {
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
		Airline airline=new Airline();
		airline.setAirName(request.getParameter("airNmae"));
		
		AirLineDao dao=new AirLineDao();
		
		int r=dao.insert(airline);
		if (r > 0) {
			
			response.sendRedirect("admindash.jsp");
			
		} else {
			response.sendError(0, "Insertion Fail");
			
		}
		
	}

}
