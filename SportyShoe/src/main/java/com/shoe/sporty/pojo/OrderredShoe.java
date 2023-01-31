package com.shoe.sporty.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class OrderredShoe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ordrid;
	private String shoeName;
	private double price;
	private String user;
	private String phoneNo;
	private long tranid;
	
	

}
