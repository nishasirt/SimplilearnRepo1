package com.learn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.User;
import com.learn.dao.UserDao;

/**
 * Servlet implementation class SelectSer
 */
public class SelectSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectSer() {
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
		UserDao dao=new UserDao();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");  
		try {
			ArrayList<User>  arr=dao.getAllUser();
			 out.println("<html><body>");  
			out.println("<table border=1 width=50% height=50%>");  
            out.println("<tr><th>UserName</th><th>Email</th><th>MobileNO</th><tr>"); 
			
			for(User u:arr)
			{
				out.print("<tr><td>"+u.getName()+" </td><td>"+u.getEmail()+"</td><td> "+u.getMobileNo()+"</td></tr>");
				
			}
			
	        
			out.println("</table>");  
            out.println("</html></body>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
