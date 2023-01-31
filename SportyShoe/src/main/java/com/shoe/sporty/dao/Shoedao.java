package com.shoe.sporty.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.shoe.sporty.pojo.Shoe;
import com.shoe.sporty.repo.ShoeRepo;

@Service
public class Shoedao {

	@Autowired  
	ShoeRepo repo;
	
	public Shoe addShoe(Shoe s) {
		return repo.save(s);
	}
	
	public List<Shoe> getAll(){
		
		return repo.findAll();
	}
     public List<Shoe> getAllAsc(){
		
		return repo.findAll(Sort.by(Sort.Direction.ASC, "price"));
	}
     
     public List<Shoe> getAllDesc(){
 		
 		return repo.findAll(Sort.by(Sort.Direction.DESC, "price"));
 	}
    public Optional<Shoe> getShoe(int id){
		
		return repo.findById(id);
	}
	
	public List<Shoe> getByCategory(int id){
		return repo.findByCid(id);
	}
	

	public Shoe updateById(Shoe c) {
		
		Shoe sobj=repo.findById(c.getId()).orElse(null);
		sobj.setShoeName(c.getShoeName());
		sobj.setColor(c.getColor());
		sobj.setBrand(c.getBrand());
		sobj.setPrice(c.getPrice());
		
		
		return repo.save(sobj);
		
		
	}
	
	public String deleteShoe(int id) {
		
		repo.deleteById(id);
		
		return "deleted";
	}
}
