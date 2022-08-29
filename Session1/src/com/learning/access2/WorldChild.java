package com.learning.access2;

import com.learning.accessmodifier1.MyClass;

public class WorldChild extends MyClass{

	
	public static void main(String[] args) {
		//access var in same class
		
		WorldChild obj=new WorldChild();
		
		System.out.println("public "+obj.a);
		//System.out.println("default "+obj.b);
		System.out.println("protected "+obj.c);
		//System.out.println("private "+obj.d);
		
	}
	
	
}
