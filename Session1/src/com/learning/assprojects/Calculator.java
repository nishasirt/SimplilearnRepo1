package com.learning.assprojects;

import java.util.Scanner;

public class Calculator {
	public static void main(String ar[])
	{
		
	    int a=0,b=0;
		char op;
		
		
		Scanner sc=new Scanner(System.in);
		
		while(true){
		System.out.println("enter the  operation symbol which you want to perform +or-or*or/");
		
		  op=sc.next().charAt(0);
		  
		  if(op=='+'||op=='-'||op=='*'||op=='/')
		  {
		  
		  System.out.println("Enter the 1st number");
	      a=sc.nextInt();
	      
	      System.out.println("Enter the 2nd number");
	      b=sc.nextInt();
		  }
	      
	      
	      if(op=='+')
	      {
	    	  System.out.println("Addition is : "+(a+b));
	      }
	      else if(op=='-')
	      {
	    	  System.out.println("Substration is : "+(a-b));
	      }
	      else if(op=='*')
	      {
	    	  System.out.println("Multiplication  is : "+(a*b));
	      } else if(op=='/')
	      {
	    	  System.out.println("Division is is : "+(a/b));
	      }
	      else{
	    	  // i just want to implement final keyword, object, method in same program so i did it in else part
	    	  System.out.println("Area of circle");
	    	  System.out.println("Enter raduis");
	    	  
	    	  int r=sc.nextInt();
	    	  
	    	  PiVal cal=new PiVal();
	    	 double areaOfCircle= cal.piValue(5);
	    	 
	    	 System.out.println("Area of circle"+areaOfCircle);
	    	  
	    	  
	      }
	      
	      
	       char exitorco = 0;
	      
	      System.out.println("Do want to continue y/n");
	      exitorco =sc.next().charAt(0);
	      
	      
	         if(exitorco=='y')
	         {
	        	 continue;
	         }
	         else if(exitorco=='n'){
	        	 break;
	         }
	         else
	         
	         {
				System.out.println("wrong command");
			}
		
	
		}
	}
	
	
	
	
}

class PiVal
{
	
	private final double pi=3.14;
	public double piValue(int raduis)
	{
		System.out.println("value of pi is"+this.pi);
		
		return pi*(raduis*raduis);
	}

}
