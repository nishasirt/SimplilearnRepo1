package com.learn.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo2Serialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
		Student student1=new Student(2, "Jose", "java lang");
		Student student2=new Student(4, "John", "c lang");
		Student student3=new Student(6, "Nisha", "python lang");
		
		ArrayList<Student> aarr=new ArrayList<>();
		aarr.add(student1);
		aarr.add(student2);
		aarr.add(student3);
		
		FileOutputStream fileOutputStream=new FileOutputStream("inputList");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(aarr);
		System.out.println("write operation is done");
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		
		//Deserlization
		
				FileInputStream fileInputStream=new FileInputStream("inputList");
				ObjectInputStream objectIntputStream2=new ObjectInputStream(fileInputStream);
				ArrayList<Student> s=(ArrayList<Student>) objectIntputStream2.readObject();
				System.out.println("Deserialized values");
				for (Student s1 : s) {
		            System.out.println(s1);
		        }

		
		
	}

}
