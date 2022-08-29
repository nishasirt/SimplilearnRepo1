package com.learning.practicesession1;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String ar[])
	{
		//factorial no
		
		//5!=1*2*3*4*5=120
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  no to get factorial");
		
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial is " +fact);
		
		
	}

}
