package com.learning.inheritence;

public class B extends A{
	
	public B()
	{
		super(5); // it will call first parent calss constuctor
	System.out.println("Child classs constructor");	
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.print();
	}

}
