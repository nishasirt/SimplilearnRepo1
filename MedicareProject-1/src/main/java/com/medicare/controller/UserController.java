package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.dao.UserDao;
import com.medicare.pojo.User;

@RestController

public class UserController {

	@Autowired
	UserDao service;

	@PostMapping("/adduser")
	public ResponseEntity<User> adduser(@RequestBody User u) {

		User user = service.addUser(u);

		if (user != null)
			return new ResponseEntity<User>(user, HttpStatus.CREATED);
		else
			return new ResponseEntity<User>(user, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@GetMapping("/getuser")
	public List<User> getAllUser() {
		return service.getAllUser();
	}

	@GetMapping("user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable String id) {
		User user = service.getUserById(id);

		if (user != null)
			return new ResponseEntity<User>(user, HttpStatus.OK);
		else
			return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
	}

	@PutMapping("update/{id}")
	public ResponseEntity<Object> updateUser(@PathVariable String id, @RequestBody User newUser) {
		User user = service.updateUser(id, newUser);

		if (user != null)
			return new ResponseEntity<Object>(user, HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No User Available to Update", HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable String id) {
		boolean result = service.deleteUser(id);
		if (result)
			return new ResponseEntity<String>("Object Deleted", HttpStatus.OK);
		else
			return new ResponseEntity<String>("NO user Found", HttpStatus.NOT_FOUND);

	}

}
