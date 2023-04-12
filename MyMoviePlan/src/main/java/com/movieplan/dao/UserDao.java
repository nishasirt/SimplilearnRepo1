package com.movieplan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieplan.pojo.User;
import com.movieplan.repo.UserRepo;

@Service
public class UserDao {
	
	@Autowired
	UserRepo repo;
	
	public User saveUser(User us)
	{
		
		return repo.save(us);
		
	}
	
	
	public User getUser(String un) {
		
		
		return repo.findByName(un);
	}
	
	

}
