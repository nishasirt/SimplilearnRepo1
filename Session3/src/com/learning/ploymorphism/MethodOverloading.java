package com.learning.ploymorphism;

public class MethodOverloading {

	
	public int add(int a,int b){
		
		return a+b;
	}
	
   public double add(double a,double b){
		
		return a+b;
	}
   public float add(float a,float b){
		
		return a+b;
	}
   public int add(int a,int b,int c){
		
		return a+b+c;
	}
   
   public static void main(String[] args) {
	   
	   MethodOverloading methodOverloading=new MethodOverloading();
	   
	   System.out.println("int Addition is"+ methodOverloading.add(2, 3));
	    System.out.println("double Addition is"+ methodOverloading.add(2.3, 3.6));
	   System.out.println("float Addition is"+ methodOverloading.add(22.2f, 36.3f));
	   System.out.println("int 3 Addition is"+ methodOverloading.add(2, 3,5));
	   
	 
	
}
}
