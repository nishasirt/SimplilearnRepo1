package com.learn.arrayprogm;

public class SumArray {
	
	public static void main(String[] args) {
		
		int[] arr={5,10,15,20,5};
		
		int sum=0,small=arr[0],big=arr[0];
		
		int [] aarRev = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			
			sum=sum+arr[i];
			
			if(arr[i]==small)
			{
				System.out.println(arr[i] +"is duplicate value");
			}
			if(arr[i]<small)
			{
				small=arr[i];
			}
			
			if(arr[i]>big)
			{
				big=arr[i];
			}
		}
		
		System.out.println("sum is "+sum);
		
		System.out.println("avg is "+sum/arr.length);
		
		System.out.println("small no is "+small);
		
		System.out.println("big no is "+big);
		
		
		int j=0;
		
		for (int i = arr.length; i < 0; i--) {
			
			
			aarRev[j]=arr[i];
			
			j++;
			
			System.out.println("reverse array is :"+aarRev[j]);
		}
		
		
		
		
		
	}

}
