package com.learning.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexexDemo {
	public static void main(String[] args) {
		
		//Pattern pattern=Pattern.compile("[abc]");
		//Pattern pattern=Pattern.compile("abc");
		//Pattern pattern=Pattern.compile("[abc]*");
		//Pattern pattern=Pattern.compile("[a-z]*");
		//Pattern pattern=Pattern.compile("[a-z]*");
	//Pattern pattern=Pattern.compile("[a-z A-Z 0-9 @ .]*");
		Pattern pattern=Pattern.compile("[a-z A-Z 0-9 ]+@");
		//any symobol which u want to allow
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a value");
		
		String  s=sc.next();
		Matcher matcher=pattern.matcher(s);
		if(matcher.matches())
		{
			System.out.println("pattrn mateched");
		}
		else{
			System.out.println("not pattrn mateched");
		}
		sc.close();
	}

}
