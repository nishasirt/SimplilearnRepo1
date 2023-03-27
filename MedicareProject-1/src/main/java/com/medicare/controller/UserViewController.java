package com.medicare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.medicare.dao.CategoryDao;
import com.medicare.dao.MedicineDao;
import com.medicare.dao.UserDao;
import com.medicare.pojo.Adminn;
import com.medicare.pojo.Category;
import com.medicare.pojo.Medicine;
import com.medicare.pojo.User;

@Controller
public class UserViewController {
	
	
	@Autowired
	UserDao dao;
	@Autowired
	CategoryDao dao1;
	@Autowired
	MedicineDao dao3;
	
	 @RequestMapping("/getloginuser")
		public ModelAndView loginPage(HttpServletRequest req,HttpServletResponse res) {
			
			ModelAndView mv=new ModelAndView();
			
			User user=dao.getUserById(req.getParameter("username"));
			
			
			try {
			if((user.getPasword()).equalsIgnoreCase(req.getParameter("psd")))
			{
				
				/* List<Shoe> list=dao1.getAll();
				 List<OrderredShoe> list1=dao2.getAllOrder();
			    	
			    	mv.addObject("list", list);
			    	mv.addObject("orderlist", list1);*/
				List<Category> list=dao1.getAllCate();
				List<Medicine> list2=dao3.getAllMedicine();
				mv.addObject("list",list2);
				mv.addObject("catlist",list);
			    	
				
				mv.setViewName("userdash.jsp");
			}
			else {
				mv.addObject("wrong", "Invalid UserName  or password");
				mv.setViewName("userlogin.jsp");
			}
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			
			
			
			
			
			
			return mv;
		}}
	


