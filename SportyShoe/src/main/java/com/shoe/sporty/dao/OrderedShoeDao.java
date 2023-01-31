package com.shoe.sporty.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.shoe.sporty.pojo.OrderredShoe;
import com.shoe.sporty.repo.OrderedShoeRepo;

@Service
public  class OrderedShoeDao {
	
	@Autowired
	OrderedShoeRepo repo;
	
	public OrderredShoe addOrder(OrderredShoe s) {
		return repo.save(s);
		
		
		
	}
	

	public List<OrderredShoe> getAllOrder() {
		return repo.findAll();
		
		
		
	}
}
