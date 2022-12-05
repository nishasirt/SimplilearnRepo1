package com.fly.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fly.dao.LoginDao;
import com.fly.exception.InValidUser;
import com.fly.pojo.Admin;

/**
 * Servlet implementation class Loginontroller
 */
public class Loginontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginontroller() {
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
		String pswd=request.getParameter("psd");
		PrintWriter out=response.getWriter();
		
		LoginDao dao=new LoginDao();
		
		 String a=dao.getPass(username);
		 
		 if(a!=null)
		 {
		  
		  if(a.equalsIgnoreCase(pswd)) {
		  
			  
			  
			  
		  response.sendRedirect("admindash.jsp"); 
		  }
		  else  { 
			  request.setAttribute("message", "Invalid id & password"); // Will be available as ${message}
		     request.getRequestDispatcher("login.jsp").forward(request,response);
		  
		  }
		  
		 }
		 else {
			 try {
			throw new InValidUser("InValid User");
			
			 }
			 catch (Exception e) {
				// TODO: handle exception
				 out.print("InValid User");
				 e.printStackTrace();
			}
		}
		 
		
	}

}
