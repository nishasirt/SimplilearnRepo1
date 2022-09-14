package com.learn.revisionmethod;

import java.util.Scanner;

public class Assignment4 {

	int wordCount(String statment) {

		String[] word = statment.split("\\s");

		return word.length;
	   }
	
	public String toString(){
		
		return "hello java";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a statment ");
		
		String s="Hello Nisha how are you.";
		
		Assignment4 assignment4=new Assignment4();
		
		System.out.println("word count is"+assignment4.wordCount(s));
		
		System.out.println(assignment4);

	}

}
