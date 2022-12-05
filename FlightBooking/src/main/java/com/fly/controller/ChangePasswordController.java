package com.fly.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fly.dao.LoginDao;
import com.fly.pojo.Admin;

/**
 * Servlet implementation class ChangePasswordController
 */
public class ChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordController() {
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
		 String username=request.getParameter("username");
		 String pass=request.getParameter("psd");
		 String cpass=request.getParameter("cpsd");
		 
		 if(!pass.equalsIgnoreCase(cpass))
		 {
			 
		 }
		 else {
			 
		Admin ad=new Admin();
		ad.setUsername(username);
		ad.setPassword(pass);
		LoginDao dao=new LoginDao();
		  int s=dao.setPass(ad);
		  if(s==1) {
			  request.setAttribute("message", "password updated sucessfully"); // Will be available as ${message}
			     request.getRequestDispatcher("changepassword.jsp").forward(request,response);
			  
		  }
		  else {
			  request.setAttribute("message", "password updated fail"); // Will be available as ${message}
			     request.getRequestDispatcher("changepassword.jsp").forward(request,response);
		  }
			 
		 }
		 
		 
		 
		 
	}

}
