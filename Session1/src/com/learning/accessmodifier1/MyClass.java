package com.learning.accessmodifier1;

public class MyClass {
	
	//class level var not in method
	public int a=10;
	int b=20;//default(in same package)
	protected int c=30;
	private int d=40;//(in within class)
	
	public static void main(String[] args) {
		//access var in same class
		
		MyClass obj=new MyClass();
		
		System.out.println("public "+obj.a);
		System.out.println("default "+obj.b);
		System.out.println("protected "+obj.c);
		System.out.println("private "+obj.d);
		
	}
	// in same class all Access modifier are accessible

}
