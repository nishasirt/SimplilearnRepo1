package com.learning.accessmodifier1;

public class AnotherCalss {
	
	public static void main(String[] args) {
		//access var in same class
		
		MyClass obj=new MyClass();
		
		System.out.println("public "+obj.a);
		System.out.println("default "+obj.b);
		System.out.println("protected "+obj.c);
		//System.out.println("private "+obj.d);
		
	}
	
	//in same package all accessible except private

}
