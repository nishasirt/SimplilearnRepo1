package com.learning.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
	
	public static void main(String[] args) {
		
		String rex="[+91]+[987]{3}[0-9]{7}";
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter mobile no");
		
		String input=sc.next();
		
		Pattern pattern=Pattern.compile(rex);
		Matcher matcher=pattern.matcher(input);
		
		if(matcher.matches()){
			System.out.println("Pattern match");
		}
		else{
			
			System.out.println("Pattern not match");
		}
		
		
	sc.close();

	}}
