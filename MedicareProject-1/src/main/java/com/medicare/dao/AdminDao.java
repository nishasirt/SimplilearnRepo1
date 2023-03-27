package com.medicare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.pojo.Adminn;
import com.medicare.pojo.User;
import com.medicare.repo.Adminnrepo;
import com.medicare.repo.UserRepo;

@Service
public class AdminDao {
	
	@Autowired
	Adminnrepo repo;
	
	public Adminn addUser(Adminn u) {
		return repo.save(u);
	}
	public List<Adminn> getAllAdminn(){
		return repo.findAll();
	}
	public Adminn getUserById(String id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
		
	}

}
