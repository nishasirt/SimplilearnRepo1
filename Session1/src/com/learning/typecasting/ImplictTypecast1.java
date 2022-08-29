package com.learning.typecasting;

public class ImplictTypecast1 {

	public static void main(String[] args) {
		
		
		//implict conversion
		byte a=10;
		short b=a;// converting byte to shot
		int c=b;//  convert short to int 
		long d=c;
		float f=d;
		double g=f;
		
		System.out.println("Byte "+a);
		
		System.out.println("Int "+c);
		
		System.out.println("float "+g);
		
	}
}
