package com.learning.ploymorphism;

public class Child extends Parent{
	
	public void test()
	{
		super.test();//calling parent class method
		System.out.println("child class");
	}

}
