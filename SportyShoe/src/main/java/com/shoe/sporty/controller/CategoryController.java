package com.shoe.sporty.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoe.sporty.dao.CategoryDao;
import com.shoe.sporty.pojo.Category;
import com.shoe.sporty.repo.CategoryRepo;

@Controller
public class CategoryController {
	
    @Autowired 
	CategoryDao dao;
	
    
    @RequestMapping("/addcategory")
    public ModelAndView addCat(HttpServletRequest req,HttpServletResponse res) {
    	
    	ModelAndView mv=new ModelAndView();
    	Category c=new Category();
    	c.setCname(req.getParameter("catname"));
    	dao.add(c);
    	List<Category> list=dao.getAllCat();
    	mv.addObject("list", list);
    	mv.setViewName("addcategory.jsp");
    	
    	return mv;
    }
    
    @RequestMapping("/getcategory")
    public ModelAndView getCat(HttpServletRequest req,HttpServletResponse res) {
    	
    	ModelAndView mv=new ModelAndView();
          List<Category> list=dao.getAllCat();
    	mv.addObject("list", list);
    	
    	
    		mv.setViewName("addshoe.jsp");
    	
    	
    	
    	return mv;
    }
    
    
    @RequestMapping("/getcategoryy")
    public ModelAndView getCate(HttpServletRequest req,HttpServletResponse res) {
    	
    	ModelAndView mv=new ModelAndView();
          List<Category> list=dao.getAllCat();
    	mv.addObject("list", list);
    	
    	mv.setViewName("addcategory.jsp");
    	
    	return mv;
    }


}
