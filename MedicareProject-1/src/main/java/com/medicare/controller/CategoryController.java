package com.medicare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.medicare.dao.CategoryDao;
import com.medicare.pojo.Category;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryDao dao;
	
	@RequestMapping("/addcategory")
	public ModelAndView addCat(HttpServletRequest req,HttpServletResponse res) {
		
		
		
		
		ModelAndView mv=new ModelAndView();
		
		
		Category c =new Category();
		
		c.setCname(req.getParameter("catname"));
		
		dao.addCategory(c);
		List<Category> list=dao.getAllCate();
		
		mv.addObject("ss", "ss");
    	mv.addObject("catlist", list);
		mv.setViewName("addcategory.jsp");
		
		
		return mv;
	}
    @RequestMapping("/getcategory")
    public ModelAndView getCat(HttpServletRequest req,HttpServletResponse res) {
    	
    	ModelAndView mv=new ModelAndView();
          List<Category> list=dao.getAllCate();
    	mv.addObject("catlist", list);
    	
    	mv.addObject("ss", "ss");
    		mv.setViewName("addcategory.jsp");
    	
    	
    	
    	return mv;
    }
    
    @RequestMapping("/deletecategory")
    public ModelAndView deleteCategory(HttpServletRequest req,HttpServletResponse res) {
    	int id=Integer.parseInt(req.getParameter("cid"));
    	ModelAndView mv=new ModelAndView();
          List<Category> list=dao.deleteCate(id);
    	       mv.addObject("catlist", list);
    	
    	       mv.addObject("ss", "ss");
    		mv.setViewName("addcategory.jsp");
    	
    	
    	
    	return mv;
    }
    

}
