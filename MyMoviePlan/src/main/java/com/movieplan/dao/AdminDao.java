package com.movieplan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieplan.pojo.Admin;
import com.movieplan.repo.AdminRepo;

@Service
public class AdminDao {
	
	
	@Autowired
	AdminRepo repo;
	
	
	public Admin add(Admin a) {
		
		
	return	repo.save(a);
	}
	
	
	
	public Admin get(String username) {
		return repo.findByName(username);
		
		
	}

}
