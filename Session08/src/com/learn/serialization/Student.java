package com.learn.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int Sid;
	private transient String sname;// prevent name feild from serialization
	private String subject;
	public Student(int sid, String sname, String subject) {
		super();
		Sid = sid;
		this.sname = sname;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", sname=" + sname + ", subject=" + subject + "]";
	}
	
	

}
