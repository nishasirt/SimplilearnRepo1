package com.learning.selftut;

public class BankAccount {
	
	public static void main(String[] args) {
		
		RegularCustomer regularCustomer=new RegularCustomer(11, "Nisha", "regular", 50000);
		RegularCustomer regularCustomer1=new RegularCustomer(12, "Rahul", "regular", 80000);
		
		
		EnterPriseCustomer enterPriseCustomer=new EnterPriseCustomer(33, "Lokesh", "enterprise", 60000);
		EnterPriseCustomer enterPriseCustomer1=new EnterPriseCustomer(33, "Shanu", "enterprise", 90000);
		
		regularCustomer.showDeatil();
		System.out.println("final amount is "+regularCustomer.getAmount(8, 5));
		
		regularCustomer1.showDeatil();
		System.out.println("final amount is "+regularCustomer1.getAmount(8, 5));
		enterPriseCustomer.showDeatil();
		System.out.println("final amount is "+enterPriseCustomer.getAmount(8, 5));
		enterPriseCustomer1.showDeatil();
		System.out.println("final amount is "+enterPriseCustomer1.getAmount(8, 5));
		
		
		
		
		
	}

}
