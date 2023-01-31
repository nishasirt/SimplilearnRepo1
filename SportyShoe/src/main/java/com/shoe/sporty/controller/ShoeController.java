package com.shoe.sporty.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.shoe.sporty.dao.CategoryDao;
import com.shoe.sporty.dao.OrderedShoeDao;
import com.shoe.sporty.dao.Shoedao;
import com.shoe.sporty.pojo.Category;
import com.shoe.sporty.pojo.Customerr;
import com.shoe.sporty.pojo.OrderredShoe;
import com.shoe.sporty.pojo.Shoe;

@Controller
public class ShoeController {
	
	@Autowired
	Shoedao dao;
	
	@Autowired
	CategoryDao dao2;
	
	@Autowired
	OrderedShoeDao dao3;
	
	@RequestMapping("/insertshoe")
	public ModelAndView addShoe(HttpServletRequest request,HttpServletResponse res) throws IllegalStateException, IOException {
		
		ModelAndView mv=new ModelAndView();
		Shoe s=new Shoe();
		
		s.setShoeName(request.getParameter("shoename"));
		s.setColor(request.getParameter("color"));
		s.setBrand(request.getParameter("brand"));
		s.setPrice(Double.parseDouble(request.getParameter("price")));
		String si[]=request.getParameter("cat").split(",");
		
		System.out.print(""+si[0]+"  "+si[1]);
		
		Category c=new Category();
		c.setCid(Integer.parseInt(si[0]));
		c.setCname(si[1]);
		
		s.setCategory(c);
		
		Shoe sh=dao.addShoe(s);
		
		
		if(sh!=null) {
			 List<Shoe> list=dao.getAll();
		    	List<OrderredShoe> lst1=dao3.getAllOrder();
		    	mv.addObject("list", list);
		    	mv.addObject("orderlist", lst1);
			mv.setViewName("admindashboard.jsp");
		}
		
		else {
			mv.setViewName("fail.jsp");
		}
		
		
		return mv;
		
	}
	
	
    @RequestMapping("/getshoe")
    public ModelAndView getCat(HttpServletRequest req,HttpServletResponse res) {
    	
    	ModelAndView mv=new ModelAndView();
         
    	List<Shoe> list=dao.getAll();
    	List<OrderredShoe> lst1=dao3.getAllOrder();
    	mv.addObject("list", list);
    	mv.addObject("orderlist", lst1);
    	mv.setViewName("admindashboard.jsp");
    	
    	
    	return mv;
    }
    @RequestMapping("/getshoeSort")
    public ModelAndView getShoeSort(HttpServletRequest req,HttpServletResponse res) {
    	
    	ModelAndView mv=new ModelAndView();
    	List<Shoe> list;
    	if(req.getParameter("pp").equalsIgnoreCase("Low to high"))
    	{
    		 list=dao.getAllAsc();
    	}
    	else {
    		
    		list=dao.getAllDesc();
    	}
         
    	
    	
    	List<Category> list1=dao2.getAllCat();
    	mv.addObject("list", list);
    	mv.addObject("list1", list1);
    	mv.addObject("username", req.getParameter("un"));
    	mv.setViewName("ecomdash.jsp");
    	
    	return mv;
    }
	
    @RequestMapping("/getshoebyCategory")
    public ModelAndView getByCat(HttpServletRequest req,HttpServletResponse res) {
    	
    	ModelAndView mv=new ModelAndView();
    	
    	
         String si[]=req.getParameter("cat").split(",");
		
		System.out.print(""+si[0]+"  "+si[1]);
		
    	int id=Integer.parseInt(si[0]);
         
    	List<Shoe> list=dao.getByCategory(id);
    	List<Category> list1=dao2.getAllCat();
    	mv.addObject("list", list);
    	mv.addObject("list1", list1);
    	mv.addObject("username", req.getParameter("un"));
    	mv.setViewName("ecomdash.jsp");
    	
    	
    	return mv;
    }
    
    
    @RequestMapping("/updateshoe")
    public ModelAndView updateShoe(HttpServletRequest request,HttpServletResponse res)
    {
    	ModelAndView mv=new ModelAndView();
         Shoe s=new Shoe();
		s.setId(Integer.parseInt(request.getParameter("sid")));
		s.setShoeName(request.getParameter("shoename"));
		s.setColor(request.getParameter("color"));
		s.setBrand(request.getParameter("brand"));
		s.setPrice(Double.parseDouble(request.getParameter("price")));
		
		Shoe s1=dao.updateById(s);
       List<Shoe> list=dao.getAll();
       List<OrderredShoe> lst1=dao3.getAllOrder();
    	mv.addObject("list", list);
    	mv.addObject("orderlist", lst1);
		mv.setViewName("admindashboard.jsp");
    	
    	return mv;
    	
    }
    
    
    
    @RequestMapping("/deleteshoe")
    public ModelAndView deleteShoe(HttpServletRequest request,HttpServletResponse res)
    {
    	ModelAndView mv=new ModelAndView();
    	int id=Integer.parseInt(request.getParameter("sid"));
    	
    	String s=dao.deleteShoe(id);
    	
    	  List<Shoe> list=dao.getAll();
    	  List<OrderredShoe> lst1=dao3.getAllOrder();
      	mv.addObject("list", list);
      	mv.addObject("orderlist", lst1);
  		mv.setViewName("admindashboard.jsp");
    	
    	return mv;
    }
    
}
