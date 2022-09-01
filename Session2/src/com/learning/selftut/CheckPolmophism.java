package com.learning.selftut;

public class CheckPolmophism {
	
	public static void main(String[] args) {
		HouseArc ac;
		
		ac=new Villa();
		
		System.out.println("Price of villas "+ac.getPrice());
		System.out.println("Bank loan providers  "+ac.bankLoan());
             ac=new Apartment();
		
		System.out.println("Price of Apartment "+ac.getPrice());
		System.out.println("Bank loan providers  "+ac.bankLoan());
              ac=new FormHouse();
		
		System.out.println("Price of FormHouse "+ac.getPrice());
		System.out.println("Bank loan providers  "+ac.bankLoan());
	}

}
