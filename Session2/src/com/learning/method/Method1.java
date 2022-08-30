package com.learning.method;

public class Method1 {
	
	public String greeting(){
		  
		return "good morning";
	}
	
	public int add(int a,int b){
		  
		return (a+b);
	}
	
	public  float cube(float n)
	{
		return n*n*n;
	}
    public static void main(String[] args) {
		Method1 m=new Method1();
		
		String res=m.greeting();
		System.out.println("result is "+res);
		
		System.out.println("re is "+m.add(5, 10));
		System.out.println("result is "+m.cube(4.0f));
	}
}
