package com.learn;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.User;
import com.learn.dao.UserDao;

/**
 * Servlet implementation class InsertSer
 */
public class InsertSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertSer() {
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
		User u =new User();
		System.out.println("inside ser");
		u.setName(request.getParameter("name"));
		u.setEmail(request.getParameter("email"));
		u.setMobileNo(Long.parseLong(request.getParameter("mobile")));
		u.setPass(request.getParameter("pswd"));
		
		UserDao dao=new UserDao();
		try {
			int r=dao.insert(u);
			if(r>0)
			{
				response.sendRedirect("sucess.html");
			}
			else{
				response.sendRedirect("fail.html");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
