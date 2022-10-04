package com.learn.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serilaization
		Student student=new Student(2, "Nisha", "java lang");
		FileOutputStream fileOutputStream=new FileOutputStream("input");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(student);
		System.out.println("write operation is done");
		objectOutputStream.close();
		fileOutputStream.close();
		
		
		//Deserlization
		
		FileInputStream fileInputStream=new FileInputStream("input");
		ObjectInputStream objectIntputStream2=new ObjectInputStream(fileInputStream);
		Student s=(Student) objectIntputStream2.readObject();
		System.out.println("Deserialized values");
		System.out.println(s);

		
		
		
	}

}
