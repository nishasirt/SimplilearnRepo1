package com.learn.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subid;
	
	private String subname;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private Classes classes;
	
	

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getName() {
		return subname;
	}

	public void setName(String subname) {
		this.subname = subname;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
	

}
