package com.movieplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieplan.dao.AdminDao;
import com.movieplan.pojo.Admin;


@CrossOrigin(origins = "*")
@RestController
public class AdminController {
	
	
	
	@Autowired
	AdminDao dao;
	
	@PostMapping("/adminregister")
	public String addAdmin(@RequestBody Admin admin) {
		
		
		dao.add(admin);
		
		return "Admin data inserted";
	}
	
	
	
	@GetMapping("/adminlogin/{un}")
	public Admin adminLogin(@PathVariable String un) {
		
		return dao.get(un);
		
	}


}
