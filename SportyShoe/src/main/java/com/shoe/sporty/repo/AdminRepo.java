package com.shoe.sporty.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shoe.sporty.pojo.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

	@Query("from Admin a where a.username=?1")
	public Admin findByName(String un);
}
