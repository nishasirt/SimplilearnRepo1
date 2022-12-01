package com.learn.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Classes;
import com.learn.bean.Student;
import com.learn.dao.ClassesDao;
import com.learn.dao.StudentDao;

/**
 * Servlet implementation class GetClassSer
 */
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentController() {
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
		 Student s=new Student();
		 
		 s.setFname(request.getParameter("fname"));
          s.setLname(request.getParameter("lname"));
          s.setAddress(request.getParameter("address"));
          String sss=request.getParameter("class");
          
          String arr[]=sss.split(",");
          
          Classes c=new Classes();
          c.setId(Integer.parseInt(arr[0]));
          c.setName(arr[1]);
          s.setClasses(c);
          
          s.setMobileNo(Long.parseLong(request.getParameter("phone")));
          Date date1;
		try {
			date1 = (Date) new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("dob"));
			java.sql.Date dob = new java.sql.Date(date1.getDate());
	          s.setDob(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StudentDao dao=new StudentDao();
		
		String sw=dao.insert(s);
		
		
		 if(sw.equalsIgnoreCase("data inserted"))
	       {
	    	  response.sendRedirect("student.jsp");
	       }
	      
	       else{
	    	   response.sendRedirect("fail.html");
	       }


			
			
		
	}

}
