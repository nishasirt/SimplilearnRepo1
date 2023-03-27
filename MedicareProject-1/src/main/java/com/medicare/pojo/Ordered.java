package com.medicare.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Ordered {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	
	
	@OneToOne
	@JoinColumn(name="mid")
	private Medicine c;
	
	private int quantyity;
	private double totalprice;
	private double totalsum;
	
	private String cardno;
	
	private String expdate;
	
	
	private int cvv;
	private String cardholdername;
	
	private String tid;
	
	
}
