package com.learrn.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilereadEc {
	
	public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the file name");
		
		String filename=sc.next();
		//read char stream
		FileReader fileInputStream=new FileReader(filename);
		
		if(fileInputStream!=null)
		{
			System.out.println("file exist");
		}
		int i=0;
		
		while((i=fileInputStream.read())!=-1)
		{
		System.out.print((char)i);
		}
		
	}

}
