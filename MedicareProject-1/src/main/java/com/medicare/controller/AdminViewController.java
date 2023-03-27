package com.medicare.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.medicare.dao.AdminDao;
import com.medicare.dao.CategoryDao;
import com.medicare.dao.MedicineDao;
import com.medicare.dao.OrderedDao;
import com.medicare.pojo.Adminn;
import com.medicare.pojo.Category;
import com.medicare.pojo.Medicine;
import com.medicare.pojo.Ordered;

@Controller
public class AdminViewController {

	@Autowired
	AdminDao dao;
	@Autowired
	CategoryDao dao1;
	@Autowired
	MedicineDao dao3;
	
	@Autowired
	OrderedDao dao4;

	Logger log = Logger.getAnonymousLogger();

	@RequestMapping("/getloginadmin")
	public ModelAndView loginPage(HttpServletRequest req, HttpServletResponse res) {

		ModelAndView mv = new ModelAndView();

		Adminn admin = dao.getUserById(req.getParameter("username"));

		try {
			if ((admin.getPassword()).equalsIgnoreCase(req.getParameter("psd"))) {

				/*
				 * List<Shoe> list=dao1.getAll(); List<OrderredShoe> list1=dao2.getAllOrder();
				 * 
				 * mv.addObject("list", list); mv.addObject("orderlist", list1);
				 */
				List<Category> list = dao1.getAllCate();
				List<Medicine> list2 = dao3.getAllMedicine();
				mv.addObject("list", list2);
				mv.addObject("catlist", list);

				mv.setViewName("admindashboard.jsp");
			} else {
				mv.addObject("wrong", "Invalid UserName  or password");
				mv.setViewName("adminlogin.jsp");
			}
		}

		catch (Exception e) {
			// TODO: handle exception
		}

		return mv;
	}
	
	
	
	@RequestMapping("getallorders")
	public ModelAndView getOrders(HttpServletRequest req, HttpServletResponse res)
	{
		
		ModelAndView mv = new ModelAndView();
		
		List<Ordered>   olist=dao4.getAllorder();
		
		
		mv.addObject("olist", olist);
		mv.setViewName("orderlist.jsp");
		
		
		
		
		
		return mv;
		
		
		
	}

}
