package com.kitchen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitchen.dao.BankDao;
import com.kitchen.pojo.Bankaccount;
import com.kitchen.repo.BankRepo;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class BankController {
	
	@Autowired
	BankDao dao;
	
	
	@Autowired
	BankRepo repo;
	
	@PostMapping("/addbank")
	public String addBank(@RequestBody  Bankaccount acc) {
		
		 dao.addBank(acc);
		 
		 return "bank added";
	}
	
	@GetMapping("/getallbank")
	public List<Bankaccount> getBanks(){
		
		return repo.findAll();
	}
	
	
	
	

}
