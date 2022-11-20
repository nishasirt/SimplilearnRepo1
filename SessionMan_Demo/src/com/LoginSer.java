package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginSer
 */
@WebServlet("/LoginSer")
public class LoginSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSer() {
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
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("index1.html");
		  rd.include(request, response);
		if(user.equals(pwd))
		{
			/*Cookie cook=new Cookie("userid", user);
			System.out.println("cookie created"+cook);
			response.addCookie(cook);
			out.print("login sucess");*/
			HttpSession session=request.getSession();
			session.setAttribute("userid",user);
			System.out.println("session is created "+ session);
			out.print("login is successfull");

			
			
		}
		else{
			
			out.print("login fail");
		}
	}

}
