package com.learning.constructor;

public class singleDimArray {

	  public static void main(String[] args) {
		int a[]={10,20,30,40,50};
		
		String name[]={"sonam", "pooja","nisha","rahul"};
		
		System.out.println("size on int array"+a.length);
		
		System.out.println("size on string array"+name.length);
		
		System.out.println(" name  at 3rd loc  "+name[2]);
		//print all
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
		for(String s:name)
		{
			System.out.println(s);
		}
	}
}
