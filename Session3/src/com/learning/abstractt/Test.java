package com.learning.abstractt;

public class Test {
	
	public static void main(String[] args) {
		
		Shape sp1=new Rectangle("red", 5, 6.3);
		
		Shape sp2=new Circle("blue", 8.1);
		
        Shape sp3=new Rectangle("orange", 6, 8.3);
		
		Shape sp4=new Circle("green", 55.1);
		
		System.out.println(sp1);
		System.out.println(sp2);
		
		System.out.println(sp3);
		System.out.println(sp4);
	}

}
