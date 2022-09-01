package com.learning.selftut;

public  abstract class Customer {
	
	
	int custId;
	
	String name;
	
	String type;
	
	

	public Customer(int custId, String name, String type) {
		super();
		this.custId = custId;
		this.name = name;
		this.type = type;
		
	}
	
	public void showDeatil()
	{
		
		System.out.println("CustId is "+custId+"\n Name is "+name +"\n customer type "+type);
	}
	
	
	
	public abstract double getAmount(double interest,int year);
	

}
