package com.shoe.sporty.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoe.sporty.pojo.Category;
import com.shoe.sporty.repo.CategoryRepo;

@Service
public class CategoryDao {
	@Autowired
	CategoryRepo repo;
	
	public Category add(Category c) {
		
		
		return repo.save(c);
	}
	
	public List<Category> getAllCat(){
		
		
		
		
		return repo.findAll();
	}

}
