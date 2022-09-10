package com.learn.revisionifelse;

import java.util.Scanner;

public class VowelOrConstant {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sting");
		String s=sc.next();
		
		
		if(s.length()>1)
		{
			System.out.println("Error! Enter only char");
		}else if(s.equalsIgnoreCase("a")||s.equalsIgnoreCase("e")||s.equalsIgnoreCase("i")||s.equalsIgnoreCase("o")||s.equalsIgnoreCase("u")){
			System.out.println(s+" is vowel");
		}
		
		else{
			
			System.out.println(s+" is consnant");
		}
	}

}
