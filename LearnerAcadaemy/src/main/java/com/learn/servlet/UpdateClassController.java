package com.learn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Classes;
import com.learn.dao.ClassesDao;

/**
 * Servlet implementation class UpdateClassController
 */
public class UpdateClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateClassController() {
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
		String name=request.getParameter("cname");
		System.out.print("name "+name);
		String id=request.getParameter("cid");
		Classes claa=new Classes();
		
		claa.setId(Integer.parseInt(id));
		claa.setName(name);
		
		ClassesDao dao=new ClassesDao();
		dao.updateClass(claa);
		
		response.sendRedirect("Dashboard.jsp");
		
	}

}
