package com.movieplan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieplan.pojo.Bankk;
import com.movieplan.repo.BankkRepo;

@Service
public class BankDao {

	@Autowired
	BankkRepo repo;
	
	public Bankk addBank(Bankk b)
	{
		
		
		return repo.save(b);
	}
	
	
	public Bankk getBank(int id) {
		
		
		
		
		return repo.findByName(id);
	}
	
	public List<Bankk>  getBankList(){
		
		
		return repo.findAll();
	}
}
