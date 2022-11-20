package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeNoSer
 */
public class PrimeNoSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeNoSer() {
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
	  int no=Integer.parseInt(request.getParameter("n1"));
	  
	  boolean b=isPrime(no);
	  PrintWriter pw=response.getWriter();
	  
	  if(b)
	  {
		  pw.print(no+" is prime no.");
	  }else{
		  pw.print(no+" is not prime no.");
	  }
	  
	  
	}
	 public  boolean isPrime(int n)
	    {
	        if (n <= 1)
	            return false;
	 
	       
	        if (n == 2 || n == 3)
	            return true;
	 
	       
	        if (n % 2 == 0 || n % 3 == 0)
	            return false;
	 
	        
	        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
	            if (n % i == 0 || n % (i + 2) == 0)
	                return false;
	 
	        return true;
	    }
}
