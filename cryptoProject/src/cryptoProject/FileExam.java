package cryptoProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileExam {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the file name");
		
		String filename=sc.next();
		FileOutputStream fileOutputStream=new FileOutputStream(filename);
		//if file is avialble it opnes in write mode else it is going to create new file
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
		
		
		
	}

}
