package com.shoe.sporty.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	

	@RequestMapping("/")
	public ModelAndView displayPage(HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("index.jsp");
		
		return mv;
	}

}
