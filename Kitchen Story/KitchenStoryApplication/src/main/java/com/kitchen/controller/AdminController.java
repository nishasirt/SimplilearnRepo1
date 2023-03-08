package com.kitchen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitchen.dao.AdminService;
import com.kitchen.pojo.Admin;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	
	@Autowired
	AdminService dao;
	
	@PostMapping("/adminregister")
	public String addAdmin(@RequestBody Admin admin) {
		
		
		dao.insert(admin);
		
		return "Admin data inserted";
	}
	
	@GetMapping("/adminlogin/{un}")
	public Admin adminLogin(@PathVariable String un) {
		
		return dao.get(un);
		
	}

}
