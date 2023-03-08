package com.kitchen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kitchen.pojo.Admin;
import com.kitchen.pojo.User;

public interface UserRepo extends JpaRepository<User, String> {
	
	
	@Query("from User a where a.uname=?1")
	public User findByName(String un);

}
