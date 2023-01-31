package com.shoe.sporty.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoe.sporty.pojo.BankData;
import com.shoe.sporty.pojo.Shoe;
import com.shoe.sporty.repo.BankRepo;

@Service
public class BankDao {
	
	@Autowired
	BankRepo repo;
	
	
	
	public BankData getData(String bankname) {
		
		return repo.getData(bankname);
	}
	
	public BankData updateById(BankData c) {
		
		BankData bank=repo.findById(c.getBankid()).orElse(null);
		bank.setBankid(c.getBankid());
		bank.setAmount(c.getAmount());
		
		
		return repo.save(bank);
		
		
	}

}
