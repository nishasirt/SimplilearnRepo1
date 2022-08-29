package com.learning.practicesession1;

import java.util.Scanner;

public class VowelOrAlpha {
	public static void main(String[] args) {
		
		char ch;
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a character");
		 
		 ch=sc.next().charAt(0);
		 
		 if(ch=='a'||ch=='A')
		 {
			 System.out.println(ch+" is vowel");
		 }
		 else if(ch=='e'||ch=='E')
		 {
			 System.out.println(ch+" is vowel");
		 }
		 else if(ch=='i'||ch=='I')
		 {
			 System.out.println(ch+" is vowel");
		 }
		 else if(ch=='o'||ch=='O')
		 {
			 System.out.println(ch+" is vowel");
		 }
		 else if(ch=='u'||ch=='U')
		 {
			 System.out.println(ch+" is vowel");
		 }
		 else{
			 System.out.println(ch+ " is Alphabad");
		 }
		
		
		
	}

}
