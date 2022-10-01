package com.learrn.io;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
	public static void main(String[] args) {
		 String filePath="F:\\file\\";
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the file name to search");
			
			String filename=sc.next();
			
			//file display in ascending order
			File f=new File(filePath);
			File[] files=f.listFiles();
			int flag=0;
			for(File ff: files){
				if(ff.getName().equals(filename))
				{
				flag=1;
				break;
				}
				else{
					
					flag=0;
				}
				
			}
			
			if(flag==1){
				System.out.println("file found");
			}
			else{
				System.out.println("file not found");
			}
	}

}
