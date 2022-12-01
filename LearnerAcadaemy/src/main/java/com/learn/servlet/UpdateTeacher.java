package com.learn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Teacher;
import com.learn.dao.TeacherDao;

/**
 * Servlet implementation class UpdateTeacher
 */
public class UpdateTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeacher() {
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
	  Teacher t=new Teacher();
	  
	  t.setTid(Integer.parseInt(request.getParameter("tid")));
	  t.setName(request.getParameter("tname"));
	  t.setDesiganmetion(request.getParameter("tdes"));
	  
	  TeacherDao dao=new TeacherDao();
	  dao.updateTeacher(t);
	  response.sendRedirect("teacher.jsp");
	  
	}

}
