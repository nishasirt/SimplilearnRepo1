package com.kitchen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitchen.dao.FoodItemDao;
import com.kitchen.pojo.FoodItem;
import com.kitchen.repo.FoodItemRepo;

@RestController
@CrossOrigin(origins = "*")
public class FoodItemController {
	
	  @Autowired
	   FoodItemDao dao;
	  
	  @Autowired
	  FoodItemRepo repo;

	  @PostMapping("/addfooditem")
	  public String addItem(@RequestBody FoodItem fi) {
		  
		  dao.addFood(fi);
		  
		  return "food added";
	  }
	  
	  @GetMapping("/getallfood")
	  public List<FoodItem>  getAllItem(){
		  
		  return dao.getAllItem();
	  }
	  
	  @GetMapping("/getalltypefood/{type}")
	  public List<FoodItem>  getAllItemType(@PathVariable  String type){
		  
		  return dao.getTypeItem(type);
	  }
	  @GetMapping("/getallfoodbycategory/{cat}")
	  public List<FoodItem>  getAllItemCat(@PathVariable  String cat){
		  
		  return dao.getFoodByCategory(cat);
	  }
	  @GetMapping("/getfood/{fname}")
	  public List<FoodItem>  getFoodByName(@PathVariable  String fname){
			
			return dao.getFoodByName(fname);
		}
	  
	  @GetMapping("/getfoodbyid/{id}")
	  public FoodItem  getFoodById(@PathVariable  int id){
			
			return repo.getFoodById(id);
		}
	  
	  
	  @DeleteMapping("/deletefood/{id}")
	  public List<FoodItem> deleteFood(@PathVariable int id)
	  {
		  return dao.deleteFood(id);
	  }
	  
	  
}
