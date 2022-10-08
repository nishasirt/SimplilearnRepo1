package com.learn.reqdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("username");
		String pass=request.getParameter("pass");
		
		RequestDispatcher rd=null;
		if(username.equalsIgnoreCase("tom")&&pass.equalsIgnoreCase("jerry")){
			
			rd=request.getRequestDispatcher("SucessServlet");
			rd.forward(request, response);
		}
		else{
			
			
			rd=request.getRequestDispatcher("requestdispatcher.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.print("<center><span style='color : red'>Invalid Credentials</span></center>");
			
		}
		
		
		
		
	}

}
