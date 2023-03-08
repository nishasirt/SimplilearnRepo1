package com.kitchen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kitchen.pojo.Admin;

public interface AdminRepo extends JpaRepository<Admin, String> {
	
	@Query("from Admin a where a.username=?1")
	public Admin findByName(String un);

}
