package com.shoe.sporty.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoe.sporty.dao.BankDao;
import com.shoe.sporty.dao.OrderedShoeDao;
import com.shoe.sporty.pojo.BankData;
import com.shoe.sporty.pojo.OrderredShoe;

@Controller
public class BankController {
	@Autowired
	BankDao dao;
	@Autowired
	OrderedShoeDao dao1;
	
	
	@RequestMapping("/payment")
	public ModelAndView getdata(HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		
		BankData b=dao.getData(req.getParameter("bank"));
		
		double amt=Double.parseDouble(req.getParameter("price"));
		//System.out.println("bank name  "+req.getParameter("bank"));
		//System.out.println("account bal  "+b.getAmount());
		double diffamt;
		if(b.getAmount()>amt) {
			
			diffamt=b.getAmount();
			BankData bb=new BankData();
			bb.setBankid(b.getBankid());
			bb.setAmount(diffamt-amt);
			BankData bn=dao.updateById(bb);
			
			
			 Random rand = new Random(); 
		      // Setting the upper bound to generate the
		      // random numbers in specific range
		      int upperbound = 500;
		      // Generating random values from 0 - 24 
		      // using nextInt()
		      int int_random = rand.nextInt(upperbound); 
		      // Generating random using nextDouble 
			
			
			OrderredShoe oo=new OrderredShoe();
			oo.setShoeName(req.getParameter("sname"));
			oo.setPrice(Double.parseDouble(req.getParameter("price")));
			oo.setUser(req.getParameter("user"));
			oo.setPhoneNo(req.getParameter("phone"));
			oo.setTranid(int_random);
			
			dao1.addOrder(oo);
			
			mv.setViewName("orderdone.jsp");
		}
		else {
			mv.setViewName("orderfail.jsp");
		}
		
		
		
		return mv;
		
		
		
		
	}
	
	
	
	
	    

}
