package com.fly.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fly.dao.PlaceDao;
import com.fly.pojo.Places;

/**
 * Servlet implementation class AddPlaceController
 */
public class AddPlaceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlaceController() {
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
		  Places p=new Places();
		  p.setPlacename(request.getParameter("place"));
		  
		  PlaceDao dao=new PlaceDao();
		 int i= dao.insert(p);
		 
		 
			if (i > 0) {
				
				response.sendRedirect("admindash.jsp");
				
			} else {
				response.sendError(0, "Insertion Fail");
				
			}
			
	}

}
