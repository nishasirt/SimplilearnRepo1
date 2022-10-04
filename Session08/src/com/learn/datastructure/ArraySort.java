package com.learn.datastructure;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		int[] arr={55,48,22,36,99,12};
		//Arrays.sort(arr);
		int temp;
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.print(arr[i]);  
		}  
		System.out.println();
		System.out.println("high value  "+arr[arr.length-2]);
		
		
	}

}
