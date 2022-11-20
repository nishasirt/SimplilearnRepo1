package com.ex.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employii {
	@Id
	private int empNo;
	@Column
	private String name;
	private String email;
	

}
