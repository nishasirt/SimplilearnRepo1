package com.kitchen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kitchen.pojo.FoodItem;

public interface FoodItemRepo extends JpaRepository<FoodItem, Integer> {
	
	@Query("from FoodItem f where f.type=?1")
	List<FoodItem> getFoodByType(String type);
	
	@Query("from FoodItem f where cname=?1")
	List<FoodItem> getFoodByCategory(String cname);
	
	@Query("from FoodItem f where f.foodName=?1")
	List<FoodItem> getFood(String foodName);
	
	@Query("from FoodItem f where f.fid=?1")
	FoodItem getFoodById(int fid);

}
