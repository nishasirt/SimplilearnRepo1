package com.movieplan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movieplan.pojo.Admin;
import com.movieplan.pojo.Bankk;

public interface BankkRepo   extends JpaRepository<Bankk, Integer>{
	
	
	@Query("from Bankk a where a.bid=?1")
	public Bankk findByName(int bid);

}
