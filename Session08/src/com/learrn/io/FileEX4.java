package com.learrn.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileEX4 {
	public static void main(String[] args) throws IOException {
		String filePath = "F:\\file\\";

		Scanner sc = new Scanner(System.in);
		System.out.println("enter file name in dir " + filePath);
		String fileName = sc.next();

		File f = new File(filePath + fileName);

		boolean b = f.createNewFile();

		if (b != true) {
			System.out.println("file created");
		} else {
			System.out.println("file created in path " + filePath);
		}
	}

}
