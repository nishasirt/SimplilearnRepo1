package com.learn.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr={55,48,22,36,99,12};
		Arrays.sort(arr);
		Scanner sc=new Scanner(System.in);
		
		
		int flag=0;
		int pos=0;
		for(int j: arr)
		{
			System.out.println(j);
		}
		System.out.println();
		
		System.out.println("enter  a key value to be search");
		int v=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(v==arr[i])
			{
				pos=i;
				flag=1;
				break;
				
			}
			else{
				flag=0;
			}

			

		}
		if(flag==1) {
			System.out.println("element is found at  : "+ pos+"  position");
		}
		else {
			System.out.println("element is not found");
		}
		
	}

}
