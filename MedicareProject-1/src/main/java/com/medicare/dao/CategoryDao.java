package com.medicare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.pojo.Category;
import com.medicare.repo.CategoryRepo;

@Service
public class CategoryDao {
	
	@Autowired
	CategoryRepo repo;
	
	
	public Category addCategory(Category c)
	{
		
		
		return repo.save(c);
	}
	
	
	public List<Category> getAllCate()
	{
		
		return repo.findAll();
	}
	
	

	public List<Category> deleteCate(int id)
	{
		
		repo.deleteById(id);
		return repo.findAll();
	}

}
