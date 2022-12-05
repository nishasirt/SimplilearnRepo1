package com.fly.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fly.dao.MapFlightDao;
import com.fly.pojo.MapFligts;

/**
 * Servlet implementation class AssignFlightController
 */
public class AssignFlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignFlightController() {
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
		String src=request.getParameter("source");
		String des=request.getParameter("destination");
		String airline=request.getParameter("airline");
		String flname=request.getParameter("flname");
		String price=request.getParameter("flprice");
		
		
		
		MapFligts fligts=new MapFligts();
		fligts.setSource(src);
		fligts.setDestination(des);
		fligts.setAirline(airline);
		fligts.setFlightName(flname);
		fligts.setPrice(Double.parseDouble(price));
		
		
		MapFlightDao dao=new MapFlightDao();
		int r=dao.insert(fligts);
		
		if(r>0) {
			
			response.sendRedirect("admindash.jsp");
		}
		
		else {
			response.sendError(0, "Flight insertion fail");
		}
		
		
		
		
		
		
	}

}
