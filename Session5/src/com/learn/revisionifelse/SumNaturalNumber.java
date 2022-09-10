package com.learn.revisionifelse;

import java.util.Scanner;

public class SumNaturalNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no till u want sum");
		
		int sum=0;
		int n=sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			
			sum=sum+i;
			
			
			
		}
		System.out.println("sum of "+n+" natural no : "+sum);
	}

}
