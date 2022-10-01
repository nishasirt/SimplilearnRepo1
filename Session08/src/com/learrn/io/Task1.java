package com.learrn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args)  throws IOException {
     Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the file name to read");
		
		String filename=sc.next();
		//read byte
		FileInputStream fileInputStream=new FileInputStream(filename);
		
		if(fileInputStream!=null)
		{
			System.out.println("file exist");
		}
		int i=0;
		StringBuilder builder=new StringBuilder();
		
		while((i=fileInputStream.read())!=-1)
		{
		System.out.print((char)i);
		builder.append((char)i);
		
		}
		
		
		System.out.println();
		
//   read and wrie to another file
		
		System.out.println("Enter the file name to write");
		
		String filename1=sc.next();
		//Byte stream
		//write
		FileOutputStream fileOutputStream=new FileOutputStream(filename1);
		//if file is avialble it opnes in write mode else it is going to create new file
		if(fileOutputStream!=null)
		{
			System.out.println("file has been created");
		}
		//System.out.println("enter data in file");
		String in=builder.toString();
		System.out.println(in);
		byte[] b=in.getBytes();
		fileOutputStream.write(b);
		
		/*int j=0;
		//or
		if((j=fileInputStream.read())!=-1)
		{
			fileOutputStream.write(j);
		}
	*/	
		
		
		System.out.println("file on write complte");
		fileOutputStream.close();
		
		fileInputStream.close();
		
		
	}
	

}
