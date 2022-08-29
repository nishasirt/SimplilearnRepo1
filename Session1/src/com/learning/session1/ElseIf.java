package com.learning.session1;

import java.util.Scanner;

public class ElseIf {
  public static void main(String[] args) {
	 int per;
	 
	 Scanner sc=new Scanner(System.in);
		
		System.out.println("enter percentage");
		per=sc.nextInt();
	 
	 if(per>=75&&per<100)
	 {
		 System.out.println("Distinction");
	 }
	 else  if(per>=60&&per<75)
	 {
		 System.out.println("First class");
	 }
	 else if(per>=45&&per<60)
	 {
		 System.out.println("Second class");
	 }
	 else if(per>=35&&per<45)
	 {
		 System.out.println("Third class");
	 } else if(per<35)
	 {
		 System.out.println("Fail");
	 }
}
}
