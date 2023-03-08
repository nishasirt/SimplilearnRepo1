package com.kitchen.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class User {
	
      @Id
     private String uname;
	private String password;
	private String name;
	private String email;
	private String mobileNo;
	private String adrress;
	
	
     
}
