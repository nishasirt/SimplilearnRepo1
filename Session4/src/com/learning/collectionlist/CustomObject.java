package com.learning.collectionlist;

import java.util.ArrayList;

class Student {
	int id;
	String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

public class CustomObject {
	public static void main(String[] args) {

		Student s1 = new Student(1, "nisha");
		Student s2 = new Student(2, "ravi");
		Student s3 = new Student(3, "shanu");
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);

		students.add(s3);
   
		
		for(Student p:students)
		{
			System.out.println(p.id+" "+p.name);
			
		}
	}
}
