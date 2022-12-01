package com.learn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learn.bean.Classes;
import com.learn.bean.ReportSubjectNTeacher;
import com.learn.dao.AssignDao;
import com.learn.dao.ClassesDao;

/**
 * Servlet implementation class AssinController
 */
public class AssinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssinController() {
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
		ReportSubjectNTeacher rp=new ReportSubjectNTeacher();
		
		String arr[]=request.getParameter("teacher").split(",");
		rp.setCid(Integer.parseInt(request.getParameter("cid")));
		ClassesDao vf=new ClassesDao();
		Classes cc=vf.getClasse(Integer.parseInt(request.getParameter("cid")));
		String name=cc.getName();
		rp.setClassName(name);
		
		String arr1[]=request.getParameter("teacher").split(",");
		rp.settName(arr1[1]);
		rp.setSubid(0);
		
		String arr2[]=request.getParameter("subject").split(",");
		rp.setSuBName(arr2[1]);
		rp.setTid(0);
		
		
		AssignDao assignDao=new AssignDao();
		String s=assignDao.insert(rp);
		 if(s.equalsIgnoreCase("data inserted"))
	       {
	    	  response.sendRedirect("Dashboard.jsp");
	       }
	      
	       else{
	    	   response.sendRedirect("fail.html");
	       }

		
		
	}

}
