package com.learrn.io;

import java.io.File;
import java.util.Scanner;

public class DisplayFilesAll {
	
	public static void main(String[] args) {
     String filePath="F:\\file\\";
		
		
		//file display in ascending order
		File f=new File(filePath);
		File[] files=f.listFiles();
		for(File ff: files){
			System.out.println(ff.getName());
		}
	}

}
