package com.learn.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	
	private String tname;
	private String Desiganmetion;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private Classes classes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="subid")
	private Subject subject;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return tname;
	}

	public void setName(String tname) {
		this.tname = tname;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getDesiganmetion() {
		return Desiganmetion;
	}

	public void setDesiganmetion(String desiganmetion) {
		Desiganmetion = desiganmetion;
	}
	
	

}
