package com.learning.string;

public class StringBuilderDemo2 {
	
	public static void main(String[] args) {
		
		String s=new String("hello java");
		StringBuilder buffer=new StringBuilder(s);
		
		buffer.append(" test");
		System.out.println(buffer);
		buffer.replace(0, 10, "User");
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
	}

}
