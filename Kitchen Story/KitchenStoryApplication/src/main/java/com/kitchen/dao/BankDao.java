package com.kitchen.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchen.pojo.Bankaccount;
import com.kitchen.repo.BankRepo;

@Service
public class BankDao {
	
	@Autowired
	BankRepo repo;
	
	
	public Bankaccount addBank(Bankaccount b)
	{
		return repo.save(b);
	}

}
