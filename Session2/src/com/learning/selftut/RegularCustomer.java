package com.learning.selftut;

public class RegularCustomer  extends Customer {
	int custId;
	String name;
	String type;
	int amt;
	
	
	 public RegularCustomer(int custId, String name, String type, int amt) {
		super(custId, name, type);
		
		this.custId=custId;
		this.name=name;
		this.amt=amt;
		this.type=type;
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAmount(double interest, int year) {
        double simple_interest=this.amt*interest*year;
        
        double amout=simple_interest+this.amt;
        
        //amout=amout-500;
        
        if(this.type.equals("small_scale"))
        {
        	return amout-500;
        }
        else if(this.type.equals("Big_scale")){
        	
        	return amout;
        }
		
		return amout;
	}
}
