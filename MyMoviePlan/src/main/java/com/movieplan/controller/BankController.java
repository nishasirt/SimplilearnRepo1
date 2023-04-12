package com.movieplan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieplan.dao.BankDao;
import com.movieplan.pojo.Bankk;

@RestController
public class BankController {

	@Autowired
	BankDao dao;

	@PostMapping("/addbank")
	public Bankk addBank(@RequestBody Bankk b) {

		return dao.addBank(b);

	}

	@GetMapping("/getbankbybid/{id}")
	public Bankk getBank(@PathVariable   int id) {

		return dao.getBank(id);
	}

	@GetMapping("/getBanklist")
	public List<Bankk> getbankList() {

		return dao.getBankList();
	}
	
	

}
