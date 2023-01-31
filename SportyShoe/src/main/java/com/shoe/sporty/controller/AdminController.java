package com.shoe.sporty.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shoe.sporty.dao.AdminDao;
import com.shoe.sporty.dao.OrderedShoeDao;
import com.shoe.sporty.dao.Shoedao;
import com.shoe.sporty.pojo.Admin;
import com.shoe.sporty.pojo.OrderredShoe;
import com.shoe.sporty.pojo.Shoe;

@Controller
public class AdminController {
	
	@Autowired
	AdminDao dao;
	@Autowired
	Shoedao dao1;
	@Autowired
	OrderedShoeDao dao2;
	Logger log=Logger.getAnonymousLogger();


	
	
	
    @RequestMapping("/getloginadmin")
	public ModelAndView loginPage(HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		
		Admin admin=dao.get(req.getParameter("username"));
		
		if((admin.getPassword()).equalsIgnoreCase(req.getParameter("psd")))
		{
			
			 List<Shoe> list=dao1.getAll();
			 List<OrderredShoe> list1=dao2.getAllOrder();
		    	
		    	mv.addObject("list", list);
		    	mv.addObject("orderlist", list1);
			mv.setViewName("admindashboard.jsp");
		}
		else {
			mv.addObject("wrong", "Invalid UserName  or password");
			mv.setViewName("adminlogin.jsp");
		}
		
		
		
		
		
		
		
		
		return mv;
	}
    
    
    public ModelAndView getoredredList(HttpServletRequest req,HttpServletResponse res) {
    	ModelAndView mv=new ModelAndView();
    	
    	
    	
    	return mv;
    }
	

}
