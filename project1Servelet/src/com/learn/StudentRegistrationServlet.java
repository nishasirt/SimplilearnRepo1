package com.learn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Student;
import com.learn.dao.StudentDao;

/**
 * Servlet implementation class StudentLoginServlet
 */
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistrationServlet() {
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
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String mobileNo=request.getParameter("mobile");
		String dob=request.getParameter("dob");
		String password=request.getParameter("pswd");
		
		
		Date date1 = null;
		try {
			date1 = (Date) new SimpleDateFormat("yyyy-mm-dd").parse(dob);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		java.sql.Date sdob = new java.sql.Date(date1.getTime());
		
		
		
     	Student s=new Student();
		s.setFname(fname);
		s.setLname(lname);
		s.setEmail(email);
		s.setMobileNo(mobileNo);
		s.setDob(sdob);
		s.setPass(password);
		
		
		StudentDao dao=new StudentDao();
		int r=0;
		try {
			r=dao.insert(s);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter pw=response.getWriter();
		
		if (r > 0) {
			pw.print("data inserted");
		} else {
			pw.print("data not inserted");
		}
	
	}

}
