package com.shoe.sporty.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoe.sporty.dao.CategoryDao;
import com.shoe.sporty.dao.Shoedao;
import com.shoe.sporty.pojo.Category;
import com.shoe.sporty.pojo.Shoe;

@RestController
public class CategoryRestController {
	
	@Autowired
	CategoryDao dao;

	@PostMapping("/addcategory")
	public Category insertcate(@RequestBody Category c)
	{
		return dao.add(c);
	}

}
