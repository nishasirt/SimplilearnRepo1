package com.learn.revisionmethod;

import java.util.Scanner;

public class Assignment3 {

	String getChar(String name) {

		return name.substring(1, name.length() - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a name");

		String s = sc.next();

		System.out.println("trim char is " + new Assignment3().getChar(s));
	}

}
