package com.learning.diamondproblem;

public class DiamondCalss implements A,B{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		DiamondCalss dd=new DiamondCalss();
		dd.print();
		
		A a=new DiamondCalss();
		a.print();
	}

}
