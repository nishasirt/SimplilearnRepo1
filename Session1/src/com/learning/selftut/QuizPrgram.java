package com.learning.selftut;

import java.util.Scanner;

public class QuizPrgram {

	
	public static void main(String[] args) {
		
		while(true)
		{	
		System.out.println("what is captial of india ?");
		System.out.println(" 1. Mumbai \n 2. Delhi \n 3.Banglore \n 4. Indore \n 5. Exit");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if(n==2){
			
			System.out.println("Correct Answer");
		}
		
		else if(n==5)
		{
			break;
		}
		else{
			System.out.println("Wrong Answer");
		}
		
		}
		
	}
	
}
