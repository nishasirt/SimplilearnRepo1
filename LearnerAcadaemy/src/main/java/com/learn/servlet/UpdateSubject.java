package com.learn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Subject;
import com.learn.dao.SubjectDao;

/**
 * Servlet implementation class UpdateSubject
 */
public class UpdateSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSubject() {
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
		Subject sub=new Subject();
		sub.setSubid(Integer.parseInt(request.getParameter("subid")));
		sub.setName(request.getParameter("subname"));
		
		SubjectDao dao=new SubjectDao();
		dao.updateSubject(sub);
		
		response.sendRedirect("subject.jsp");
		
	}

}
