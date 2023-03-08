package com.kitchen.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchen.pojo.Admin;
import com.kitchen.repo.AdminRepo;

@Service
public class AdminService {

	@Autowired
	AdminRepo repo;
	
	
	public Admin insert(Admin a) {
		
		return repo.save(a);
		
		
		
	}
	
	
	public Admin get(String username) {
		return repo.findByName(username);
		
		
	}
}
