package com.shoe.sporty.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shoe.sporty.pojo.BankData;

public interface BankRepo extends JpaRepository<BankData, Integer>{
	@Query("from BankData b where b.name=?1")
	BankData getData(String name);

}
