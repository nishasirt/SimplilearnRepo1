package com.learning.typecasting;

public class ExplictTypeCast {
	
	public static void main(String[] args) {
		int a=10;
		byte b=(byte) a;//Explict conversion
		
		System.out.println("int "+a);
		System.out.println("byte "+b);
		
		double d=20.55;
		int s=(int) d;
		
		System.out.println("double "+d);
		System.out.println("int "+s);
		
	}

}
