package com.shoe.sporty.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoe.sporty.pojo.Admin;
import com.shoe.sporty.repo.AdminRepo;

@Service
public class AdminDao {

	@Autowired
	AdminRepo repo;
	
	
	public Admin get(String username) {
		return repo.findByName(username);
		
		
	}
}
