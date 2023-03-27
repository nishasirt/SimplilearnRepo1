package com.medicare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.pojo.Cart;
import com.medicare.repo.CaetRepo;

@Service
public class CartDao {
	
	@Autowired
	CaetRepo repo;
	
	public Cart addIncart(Cart cart)
	{
		return repo.save(cart);
	}
	
	public List<Cart>   getCartdata()
	{
		
		
		return repo.findAll();
	}
	
	public String deleteCarttData()
	{
		
		
		repo.deleteAll();
		
		return "cart empty";
	}

}
