package com.learrn.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExam2 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the file name");
		
		String filename=sc.next();
		//charcter stream
		FileWriter fileOutputStream=new FileWriter(filename,true);
		//if file is avialble it opnes in write mode else it is going to create new file
		if(fileOutputStream!=null)
		{
			System.out.println("file has been created");
		}
		System.out.println("enter data in file");
		String in=sc.next()+sc.nextLine();
		System.out.println(in);
		//byte[] b=in.getBytes();
		fileOutputStream.write(in);
		System.out.println("file on write complte");
		fileOutputStream.close();
		
	
		
	}

}
