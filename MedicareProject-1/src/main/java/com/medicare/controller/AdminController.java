package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.dao.AdminDao;
import com.medicare.dao.CategoryDao;
import com.medicare.dao.UserDao;
import com.medicare.pojo.Adminn;
import com.medicare.pojo.User;

@RestController
public class AdminController {
	@Autowired
	AdminDao service;
	@Autowired
	CategoryDao dao;

	@PostMapping("/addadmin")
	public ResponseEntity<Adminn> adduser(@RequestBody Adminn u) {

		Adminn admin = service.addUser(u);

		if (admin != null)
			return new ResponseEntity<Adminn>(admin, HttpStatus.CREATED);
		else
			return new ResponseEntity<Adminn>(admin, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@GetMapping("/getadmin")
	public List<Adminn> getAllAdmin() {
		return service.getAllAdminn();
	}

	@GetMapping("admim/{id}")
	public ResponseEntity<Adminn> getUserById(@PathVariable String id) {
		Adminn user = service.getUserById(id);

		if (user != null)
			return new ResponseEntity<Adminn>(user, HttpStatus.OK);
		else
			return new ResponseEntity<Adminn>(user, HttpStatus.NOT_FOUND);
	}

}
