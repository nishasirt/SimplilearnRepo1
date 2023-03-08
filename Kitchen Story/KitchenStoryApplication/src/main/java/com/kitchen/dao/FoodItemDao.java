package com.kitchen.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchen.pojo.FoodItem;
import com.kitchen.repo.FoodItemRepo;

@Service
public class FoodItemDao {
	
	@Autowired
	FoodItemRepo repo;
	
	
	public FoodItem addFood(FoodItem f) {
		
		
		return repo.save(f);
	}
	
	
	public List<FoodItem>  getAllItem(){
		
		return repo.findAll();
	}
public List<FoodItem>  getFoodByName(String fname){
		
		return repo.getFood(fname);
	}

	public List<FoodItem>  getTypeItem(String type){
		
		return repo.getFoodByType(type);
	}

public List<FoodItem>  getFoodByCategory(String cat){
		
		return repo.getFoodByCategory(cat);
	}

    public List<FoodItem> deleteFood(int id){
    	
    	repo.deleteById(id);
    	
    	return repo.findAll();
    }
}
