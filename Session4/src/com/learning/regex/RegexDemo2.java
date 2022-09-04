package com.learning.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
public static void main(String[] args) {
	String regex="[a-z A-Z]";
	String s="Welcome@ to the world og rexes";
	
	Pattern pattern=Pattern.compile(regex);
	
	Matcher matcher=pattern.matcher(s);
	
	while(matcher.find())
	{
		
		System.out.println(s.substring(matcher.start(), matcher.end()));
	}
	
}
}
