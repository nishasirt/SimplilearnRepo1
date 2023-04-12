package com.movieplan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movieplan.pojo.Admin;

public interface AdminRepo extends JpaRepository<Admin, String>{
	@Query("from Admin a where a.uname=?1")
	public Admin findByName(String un);
}
