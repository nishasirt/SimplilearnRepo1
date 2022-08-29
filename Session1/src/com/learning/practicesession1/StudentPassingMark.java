package com.learning.practicesession1;

import java.util.Scanner;

public class StudentPassingMark {
	
	public static void main(String[] args) {
		
		int marks;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter mark");
		
		marks=sc.nextInt();
		
		if(marks>35)
			{
			System.out.println("You are Passed");
			}
		else
		{
			System.out.println("You are Failed");
		}
		
	}

}
