package com.learning.constructor;

public class MultiDimArray {
  public static void main(String[] args) {
	int a[][]={{1,2,3},{4,5,6}};
	
	System.out.println("dirct"+a[1][2]);
   //row	
	for (int i = 0; i < 2; i++) {
		//col
		for (int j = 0; j < 3; j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println("using for each");

  for(int ar[]:a)
  {
	  for(int x:ar)
	  {
		  System.out.print(x+"\t");
		  
		  System.out.println();  
	  }
  }

}}