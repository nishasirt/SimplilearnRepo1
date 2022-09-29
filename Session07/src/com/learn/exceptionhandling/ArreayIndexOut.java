package com.learn.exceptionhandling;

public class ArreayIndexOut {
	
	public static void main(String[] args) {
		int[] arr=new int[5];
		try{
			arr[4]=55;
			System.out.println(arr[4]);
			
		}
	catch(Exception e)
		{
		e.printStackTrace();
		}
		finally {
			System.out.println("hello");
		}
		
		
		
	}

}
