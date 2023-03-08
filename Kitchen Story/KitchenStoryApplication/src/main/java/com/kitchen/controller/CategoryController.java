package com.kitchen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitchen.dao.CategoryDao;
import com.kitchen.pojo.Admin;
import com.kitchen.pojo.Category;

@RestController
@CrossOrigin(origins ="*")
public class CategoryController {
	
	@Autowired
	CategoryDao dao;
	
	
	@PostMapping("/addcategory")
	public String addAdmin(@RequestBody Category c) {
		
		
		dao.insertCate(c);
		
		return "Category added ";
	}
	
	@GetMapping("/getallcate")
	public List<Category> getAllCate()
	{
		
		return dao.getAllCategory();
	}

}
