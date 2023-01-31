package com.shoe.sporty.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shoe.sporty.pojo.Admin;
import com.shoe.sporty.pojo.Customerr;

public interface CustomerRep extends JpaRepository<Customerr, Integer>{
	
	@Query("from Customerr a where a.username=?1")
	public Customerr findByName(String un);

}
