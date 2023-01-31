package com.shoe.sporty.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BankData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankid;
	private String name;
	private double amount;
}
