package com.medicare.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@Column(name="id")
	private String uname;
	private String name;
	private String pasword;
	private String email;
	private String mobileNo;
	private String address;
	private int login;
}
