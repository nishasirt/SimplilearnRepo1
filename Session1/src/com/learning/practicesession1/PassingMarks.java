package com.learning.practicesession1;

import java.util.Scanner;

public class PassingMarks {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your percentage");
		int n=sc.nextInt();
		
		
		if(n>35)
		{
			System.out.println("Passed! Congrates");
		}
		else{
			System.out.println("Fail ! Try next time good luck");
		}
		
		
	}
}
