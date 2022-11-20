package com.learn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Student;
import com.learn.dao.StudentDao;

/**
 * Servlet implementation class StudentListSer
 */
public class StudentListSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StudentDao dao=new StudentDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentListSer() {
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
		try {
			ArrayList<Student> st=dao.getAllStudent();
			PrintWriter pw=response.getWriter();
			
			for (Student student : st) {
				pw.println(student.getId()+" - "+student.getFname()+" "+student.getLname()+" "+student.getEmail()+" "+student.getMobileNo()+" "
						);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
