package com.movieplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieplan.dao.UserDao;
import com.movieplan.pojo.User;

@RestController
public class UserController {
	
	
	@Autowired
    UserDao dao;
	
	@PostMapping("/adduser")
	public User addUser(User u)
	{
		
		return dao.saveUser(u);
		
	}
	
	
	@GetMapping("/getUser/{uname}")
	public User getUser(String uname)
	{
		
		
		return dao.getUser(uname);
	}
	
	
	
	
	
	

}
