package com.learn.config_context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config=getServletConfig();
		PrintWriter printWriter=response.getWriter();
		printWriter.print("<h1>Servlet config </h1><br/>");
		
		printWriter.print("sql = "+config.getInitParameter("sql")+"<br/>");
		
		printWriter.print("message  ="+config.getInitParameter("Message"));
		
		ServletContext context=getServletContext();
		
		printWriter.print("<h1>Servlet Context </h1><br/>");
	     printWriter.print("driver ser 2  = "+context.getInitParameter("Driver")+"<br/>");
			
			printWriter.print("message ser 2  ="+context.getInitParameter("URL"));
	}

}
