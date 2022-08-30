package com.learning.constructor;

import java.util.Scanner;

public class SingleDimArray2 {

	public static void main(String[] args) {
		  int a[]=new int[5];
		  
		  Scanner sc=new Scanner(System.in);
		  
		  for (int i = 0; i < a.length; i++) {
			System.out.println("enter any no");
			
			a[i]=sc.nextInt();
		}
		  System.out.println("lets print");
		  
		 for(int n:a) {
			System.out.println(n);
		}
	}
}
