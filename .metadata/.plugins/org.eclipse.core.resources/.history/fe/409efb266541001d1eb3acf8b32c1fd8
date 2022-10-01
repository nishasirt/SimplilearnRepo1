package com.learn.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\n 1.  Display\n 2. Menu\n 3.Exit ");
		int i=sc.nextInt();
		String filePath="F:\\file\\";
		
	
		switch (i) {
		case 1:
			
			File f=new File(filePath);
			File[] files=f.listFiles();
			for(File ff: files){
				System.out.println(ff.getName());
			}
			
			
			break;
			
		case 2:
			System.out.println("Enter SubMenu \n 1.  Add\n 2. Delete\n 3.Search\n 4.Exit ");
			int j=sc.nextInt();
			switch (j) {
			case 1:
				
					System.out.println("enter file name in dir "+filePath);
				String fileName=sc.next();
				
				File f1=new File(filePath+fileName);
				
				boolean b=f1.createNewFile();
				
				if(b!=true)
				{
					System.out.println("file created");
				}
				else{
					System.out.println("file created in path "+filePath);
				}
				break;
				
			case 2:
				
				System.out.println("enter file name in dir to delete "+filePath);
				String fileNamedel=sc.next();
				
				File f2=new File(filePath+fileNamedel);
				
				boolean b1=f2.delete();
				System.out.println(b1);
				
				if(b1==true)
				{
					System.out.println("file deleted");
				}
				else{
					System.out.println("file not found");
				}
				
			case 3:
				
				System.out.println("Enter the file name to search");
				
				String filenamesearch=sc.next();
				
				//file display in ascending order
				File f3=new File(filePath);
				File[] files1=f3.listFiles();
				int flag=0;
				for(File ff: files1){
					if(ff.getName().equals(filenamesearch))
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
				
				break;
				
			case 4:
				
				break;

			default:
				break;
			}
			
			
			break;
			
		case 3:
			
			System.exit(0);
			
			break;

		default:
			break;
		}
		
		
		
	}

}
