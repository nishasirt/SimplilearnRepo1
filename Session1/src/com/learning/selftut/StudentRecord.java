package com.learning.selftut;

public class StudentRecord {
	
	public static void main(String[] args) {
		
		Student[] st=new Student[5];
		

		st[0]=new Student("Nisha", 11);
		st[1]=new Student("Shanu", 12);
		st[2]=new Student("Rahul", 13);
		st[3]=new Student("Jaya", 14);
		st[4]=new Student("Lokesh", 15);
		
		for (int i = 0; i < st.length; i++) {
			
			System.out.println("Name : "+st[i].name+" Roll No : "+st[i].rollNo);
			
		}
		
		
		
	}

}

class Student{
	
	
	
	String name;
	int rollNo;
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
	
	
	
	
	
}
