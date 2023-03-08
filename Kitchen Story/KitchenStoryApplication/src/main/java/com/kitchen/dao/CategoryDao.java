package com.kitchen.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchen.pojo.Category;
import com.kitchen.repo.CategoryRepo;

@Service
public class CategoryDao {
	
	@Autowired
	CategoryRepo repo;
	
	
	public Category insertCate(Category c) {
		
		
		return repo.save(c);
	}
	
	public List<Category> getAllCategory(){
		
		
		return repo.findAll();
	}

}
