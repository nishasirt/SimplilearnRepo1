package com.learn.revisionifelse;

import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a");
		
		int a=sc.nextInt();
		System.out.println("enter b");
		
		int b=sc.nextInt();
		
		System.out.println("enter c");
		
		int c=sc.nextInt();
		
		
		if(a>b&&a>c)
		{
			System.out.println(a+" a is greater");
		}
		else if(b>c&&b>c)
		{
			System.out.println(b+" b is greater");
			
		}
		else{
			System.out.println(c+" c is greater");
		}
		}

}
