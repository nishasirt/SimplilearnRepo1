package com.learrn.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
	public static void main(String[] args) throws IOException {
		String filePath="F:\\file\\";
		
		Scanner sc=new   Scanner(System.in);
		System.out.println("enter file name in dir to delete "+filePath);
		String fileName=sc.next();
		
		File f=new File(filePath+fileName);
		
		boolean b=f.delete();
		System.out.println(b);
		
		if(b==true)
		{
			System.out.println("file deleted");
		}
		else{
			System.out.println("file not found");
		}
	}
}
