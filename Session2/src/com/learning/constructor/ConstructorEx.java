package com.learning.constructor;

public class ConstructorEx {
	
	private int id;
	private String name;
	String email;
	
	
	public ConstructorEx() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	
	public ConstructorEx(int id,String name,String email)// local variable
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public void print1()
	{
		System.out.println("Id : "+id+" Name : "+name+" email :"+email);
	}
	
	public static void main(String[] args) {
		
		ConstructorEx cex=new  ConstructorEx();
		
		ConstructorEx ex=new ConstructorEx(5, "nisha", "nisha@gamil.com");
		ConstructorEx ex1=new ConstructorEx(6, "rahul", "rahul@gamil.com");
		
		ex.print1();
		ex1.print1();
		cex.print1();
	}

}
