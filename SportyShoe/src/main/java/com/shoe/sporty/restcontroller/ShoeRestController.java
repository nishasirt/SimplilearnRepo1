package com.shoe.sporty.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.shoe.sporty.dao.Shoedao;
import com.shoe.sporty.pojo.Shoe;

@RestController
public class ShoeRestController {
	@Autowired
	Shoedao shoedao;
	
	@PostMapping("/insertshoe")
	public Shoe insertShoe(@RequestBody Shoe s)
	{
		return shoedao.addShoe(s);
	}
	
	
	@GetMapping("/getshoe")
	public List<Shoe>  getAllProducts(){
		
		return shoedao.getAll();
		
	}
}
