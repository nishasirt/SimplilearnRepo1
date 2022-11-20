package com.learn;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Student;
import com.learn.dao.StudentDao;

/**
 * Servlet implementation class StudentDeleteSer
 */
public class StudentDeleteSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	StudentDao dao=new StudentDao();
    public StudentDeleteSer() {
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
		//int id=Integer.parseInt(request.getParameter("n1"));
		String mobile=request.getParameter("n1");
		
		Student s=new Student();
		//s.setId(id);
		s.setMobileNo(mobile);
		
		
		try {
			//int r=dao.deleteDataPre(s);
			int r=dao.deleteDataMobile(s);
			if (r > 0) {
				System.out.println("delete done");
			} else {
				System.out.println("delete fail");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
