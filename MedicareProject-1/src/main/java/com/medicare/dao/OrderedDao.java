package com.medicare.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.pojo.Cart;
import com.medicare.pojo.Ordered;
import com.medicare.repo.CaetRepo;
import com.medicare.repo.OrderRepo;

@Service
public class OrderedDao {
	
	
	@Autowired
	OrderRepo repo;
	
	@Autowired
	CaetRepo repo1;
	
	
	@org.springframework.transaction.annotation.Transactional
	public String insertorder(Ordered o)
	{
		
		repo.save(o);
		
		return "";
	}
	
	
	
	
	public List<Ordered>  getAllorder()
	{
		
		
		return repo.findAll();
	}
	

}
