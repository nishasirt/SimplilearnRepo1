package com.shoe.sporty.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoe.sporty.pojo.Admin;
import com.shoe.sporty.pojo.Customerr;
import com.shoe.sporty.repo.CustomerRep;

@Service
public class Customerdao {

	@Autowired
	CustomerRep repo;

	public Customerr addUser(Customerr c) {

		return repo.save(c);
	}

	public Customerr get(String username) {
		return repo.findByName(username);

	}

}
