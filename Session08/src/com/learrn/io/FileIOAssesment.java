package com.learrn.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIOAssesment {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the file name");
	
	String filename=sc.next();
	//Write to File
	FileOutputStream fileOutputStream=new FileOutputStream(filename,true);// to append in existing file
	
	if(fileOutputStream!=null)
	{
		System.out.println("file has been created");
	}
	System.out.println("enter data in file");
	String in=sc.next()+sc.nextLine();
	System.out.println(in);
	byte[] b=in.getBytes();
	fileOutputStream.write(b);
	System.out.println("file on write complte");
	fileOutputStream.close();
	
	// Read From File
	
	System.out.println("Enter the file name to read");
	
	String filename1=sc.next();
	
	FileReader fileInputStream=new FileReader(filename1);
	
	if(fileInputStream!=null)
	{
		System.out.println("file exist");
	}
	int i=0;
	
	while((i=fileInputStream.read())!=-1)
	{
	System.out.print((char)i);
	}
	
	fileInputStream.close();
	
	
}
}
