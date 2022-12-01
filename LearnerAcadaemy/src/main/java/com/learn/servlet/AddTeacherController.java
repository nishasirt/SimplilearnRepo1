package com.learn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Teacher;
import com.learn.dao.TeacherDao;

/**
 * Servlet implementation class AddTeacherController
 */
public class AddTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherController() {
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
		TeacherDao teacherDao=new TeacherDao();
		
		Teacher t=new Teacher();
		
		t.setName(request.getParameter("tname"));
		t.setDesiganmetion(request.getParameter("desname"));
		
		
	    String s=	teacherDao.insert(t);
	    
		
		 if(s.equalsIgnoreCase("data inserted"))
	       {
	    	  response.sendRedirect("teacher.jsp");
	       }
	      
	       else{
	    	   response.sendRedirect("fail.html");
	       }

		
	}

}
