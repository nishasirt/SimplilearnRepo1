package com.learn.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) throws IOException  {
		Project obj  = new Project();
		obj .lockMe();

	}

	public void lockMe() throws IOException  {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter\n 1. For Display\n 2. For Menu\n 3. For Exit ");
			int i = sc.nextInt();
			String filePath = "F:\\file\\";

			switch (i) {
			case 1:

				File f = new File(filePath);
				File[] files = f.listFiles();
				for (File ff : files) {
					System.out.println(ff.getName());
				}

				break;

			case 2:
				boolean z=true;
				while(z){
				System.out.println("Enter SubMenu \n 2.1 Add\n 2.2 Delete\n 2.3 Search\n 2.4 Exit ");
				String j = sc.next();
				switch (j) {
				case "2.1":
					
					
                     
					System.out.println("enter file name in dir " + filePath);
					String fileName = sc.next();

					File f1 = new File(filePath + fileName);

					boolean b = f1.createNewFile();

					if (b != true) {
						System.out.println("file created");
					} else {
						System.out.println("file created in path " + filePath);
					}
					break;

				case "2.2":

					System.out.println("enter file name in dir to delete " + filePath);
					String fileNamedel = sc.next();

					File f2 = new File(filePath + fileNamedel);

					boolean b1 = f2.delete();
					// System.out.println(b1);

					if (b1 == true) {
						System.out.println("file deleted");
					} else {
						System.out.println("file not found");
					}
					break;
				case "2.3":

					System.out.println("Enter the file name to search");

					String filenamesearch = sc.next();

					// file display in ascending order
					File f3 = new File(filePath);
					File[] files1 = f3.listFiles();
					int flag = 0;
					for (File ff : files1) {
						if (ff.getName().equals(filenamesearch)) {
							flag = 1;
							break;
						} else {

							flag = 0;
						}

					}

					if (flag == 1) {
						System.out.println("file found");
					} else {
						System.out.println("file not found");
					}

					break;

				case "2.4":
					
                      z=false;
                      System.out.println("out from submenu");
                      
					break;

				default:
					System.out.println("SubMenu Option is not aviable");
					break;
				}
				}
		
				break;
			case 3:
				System.out.println("Program End....");
				System.exit(0);

				break;

			default:
				System.out.println("Menu Option is not aviable");
				
				break;
			}

		}

	}
}
