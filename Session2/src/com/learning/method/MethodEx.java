package com.learning.method;

public class MethodEx {
	
	public void print()
	{
		
		System.out.println("Hello java");
	}
	
	public void calculate(int a,int b)
	{
		
		System.out.println("additin  "+(a+b));
		
		
	}
	
	public void fullname(String name,String middname,String lname)
	{
		System.out.println("Full name is  "+name+middname+lname);
		
	}
	public static void main(String[] args) {
		MethodEx m=new MethodEx();
		
		m.print();
		m.calculate(3, 6);
		m.fullname("nihsa", "lokesh", "chouhan");
	}

}
