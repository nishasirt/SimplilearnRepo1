package com.learn.revisionifelse;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 1st floating value");
		
		float f1=sc.nextFloat();
		System.out.println("enter 2nd  floating value");
		float f2=sc.nextFloat();
		
		if(Math.round(f1)==Math.round(f2))
		{
			System.out.println("both r equal");
			
			
		}
		else{
			
			System.out.println("both r not equal");
		}
		
		
		
		
	}

}
