package com.learning.practicesession1;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a no");
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("no is even");
		}
		else {
			System.out.println("no is odd");
		}
	}

}
