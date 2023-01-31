package com.shoe.sporty.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoe.sporty.dao.CategoryDao;
import com.shoe.sporty.dao.Customerdao;
import com.shoe.sporty.dao.Shoedao;
import com.shoe.sporty.pojo.Admin;
import com.shoe.sporty.pojo.Category;
import com.shoe.sporty.pojo.Customerr;
import com.shoe.sporty.pojo.Shoe;


@Controller
public class CustomerController {
	
	@Autowired
	Customerdao dao;
	@Autowired
	Shoedao dao1;
	@Autowired
  CategoryDao dao2;
  
	
	@RequestMapping("/insertuser")
	public ModelAndView addShoe(HttpServletRequest request,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		
		Customerr cc=new Customerr();
		cc.setUsername(request.getParameter("username"));
		cc.setPassword(request.getParameter("psd"));
		cc.setPhone(request.getParameter("phone"));
		cc.setEmail(request.getParameter("email"));
		
		if(cc!=null) {
			dao.addUser(cc);
			mv.setViewName("customerlogin.jsp");
		}
		
		return mv;
	}
	
	
	 @RequestMapping("/userlogin")
	public ModelAndView loginUser(HttpServletRequest request,HttpServletResponse res)
	{
		ModelAndView mv=new ModelAndView();
		
   Customerr cus=dao.get(request.getParameter("username"));
		
		if((cus.getPassword()).equalsIgnoreCase(request.getParameter("psd")))
		{
			List<Shoe> list=dao1.getAll();
			List<Category> list1=dao2.getAllCat();
	    	
	    	mv.addObject("list", list);
	    	mv.addObject("list1", list1);
	    	mv.addObject("username", request.getParameter("username"));
			 
			mv.setViewName("ecomdash.jsp");
		}
		else {
			mv.addObject("wrong", "Invalid UserName  or password");
			mv.setViewName("customerlogin.jsp");
		}
		
		return mv;
		
		
	}
	 
	 
	 @RequestMapping("/getShoeAndUser")
	 public ModelAndView getUserShoe(HttpServletRequest request,HttpServletResponse res) {
		 ModelAndView mv=new ModelAndView();
		 
		 Customerr cc=dao.get(request.getParameter("username"));
		 Optional<Shoe> ss=dao1.getShoe(Integer.parseInt(request.getParameter("sid")));
		 Shoe s1 = null;
		 if (ss.isPresent()) {
			s1=ss.get();
		}
		 mv.addObject("customer", cc);
		 mv.addObject("shoe", s1);
		 mv.setViewName("buyshoe.jsp");
		 
		 
		 
		 
		 return mv;
		 
		 
	 }
		

}
