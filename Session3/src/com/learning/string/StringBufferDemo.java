package com.learning.string;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		String s=new String("hello word");
		StringBuffer buffer=new StringBuffer(s);
		
		buffer.append(" test");
		System.out.println(buffer);
		buffer.replace(12, 17, "User");
		System.out.println(buffer)
		;
		buffer.reverse();
		System.out.println(buffer);
		
	}

}
