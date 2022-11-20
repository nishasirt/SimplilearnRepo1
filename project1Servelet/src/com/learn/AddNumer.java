package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNumer
 */
public class AddNumer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNumer() {
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
		 int n1= Integer.parseInt(request.getParameter("n1")) ;
		   int n2= Integer.parseInt(request.getParameter("n2")) ;
		   
		   PrintWriter pw=response.getWriter();
		   // to print html content in Printwriter..
		   response.setContentType("text/html");
		   pw.print("addition of n1 and n2 is : "+(n1+n2));
		   pw.print("<html><body></body><h2>Addtion of n1 and n2 is :" +(n1+n2)+"</h2></html>");
	}

}
