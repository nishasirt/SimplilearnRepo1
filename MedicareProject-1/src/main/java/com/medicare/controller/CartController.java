package com.medicare.controller;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.medicare.dao.CartDao;
import com.medicare.dao.CategoryDao;
import com.medicare.dao.MedicineDao;
import com.medicare.dao.OrderedDao;
import com.medicare.pojo.Cart;
import com.medicare.pojo.Category;
import com.medicare.pojo.Medicine;
import com.medicare.pojo.Ordered;

@Controller
public class CartController {
	
	
	@Autowired
	CartDao dao;
	
	
	@Autowired
	CategoryDao dao1;
	@Autowired
	MedicineDao dao3;
	
	@Autowired
	OrderedDao dao4;
	
	@RequestMapping("/addcart")
	public ModelAndView addCart(HttpServletRequest req,HttpServletResponse res)
	{
		
		ModelAndView mv=new ModelAndView();
		Cart c=new Cart();
		int mid=Integer.parseInt(req.getParameter("mid"));
		Medicine m=dao3.getMedicine(mid);
		c.setMedince(m);
		
		int quan=Integer.parseInt(req.getParameter("quan"));
		
		c.setQuantyity(quan);
		c.setTotalprice(quan*m.getPrice());
		dao.addIncart(c);
		List<Category> list=dao1.getAllCate();
		List<Medicine> list2=dao3.getAllMedicine();
		mv.addObject("list",list2);
		mv.addObject("catlist",list);
		
		
		
		  mv.setViewName("userdash.jsp");
		
		
		return mv;
		
		
	}
	
	@RequestMapping("/getcartdata")
	public ModelAndView getCart(HttpServletRequest req,HttpServletResponse res)
	{
		
		ModelAndView mv=new ModelAndView();
		
		List<Cart> list=dao.getCartdata();
		
		mv.addObject("list", list);
		
		mv.setViewName("cart.jsp");
		
		
		return mv;
		
		
		
	}
	

	@RequestMapping("/deletecartdata")
	public ModelAndView deleteCart(HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		
		String uniqueID = UUID.randomUUID().toString();
		String cno=req.getParameter("c1");
		String cname=req.getParameter("c4");
		String cdate=req.getParameter("c2");
		int cvv=Integer.parseInt(req.getParameter("c3"))   ;
		
		
		
		List<Cart> lstcart=dao.getCartdata();
		
		
		Ordered o=null;
		for (Cart cart : lstcart) {
			
			o=new Ordered();
			System.out.println(cart.getCartid());
			o.setC(cart.getMedince());
			o.setCardno(cno);
			o.setCardholdername(cname);
			o.setCvv(cvv);
			o.setExpdate(cdate);
			o.setTid(uniqueID);
			o.setQuantyity(cart.getQuantyity());
			o.setTotalprice(cart.getTotalprice());
			
			
			
			dao4.insertorder(o);
			
			
			
		}
		
		
		
		
		String s=dao.deleteCarttData();
		
		
		
		mv.setViewName("ordersucess.jsp");
		
		
		return mv;
		
	}
	
	
	
	
	
	

}
