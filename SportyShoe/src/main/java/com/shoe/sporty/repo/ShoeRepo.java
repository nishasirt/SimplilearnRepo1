package com.shoe.sporty.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.shoe.sporty.pojo.Shoe;

public interface ShoeRepo extends JpaRepository<Shoe, Integer> {
	
	@Query("from Shoe p where p.category.cid=?1")
	public List<Shoe> findByCid(int id);

}
