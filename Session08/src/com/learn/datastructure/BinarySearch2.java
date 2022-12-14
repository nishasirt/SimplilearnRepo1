package com.learn.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {
	public static void main(String[] args) {
		int[] arr = { 55, 48, 22, 36, 99, 12 };
		Arrays.sort(arr);
		Scanner sc = new Scanner(System.in);

		for (int j : arr) {
			System.out.println(j);
		}
		System.out.println();

		System.out.println("enter  a key value to be search");
		int key = sc.nextInt();

		/*
		 * 1. find mid=(low+high)/2;
		 *  2.if a[mid]==key value return the location
		 * 3.if a[mid]>key =>high=mid-1 
		 * 4.if a[mid]<key =>low=mid+1
		 */
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		int flag = 0;

		while(low<=high) {
			mid=(low+high)/2;
			//System.out.println("mid"+mid);
			if(arr[mid]==key) {
				flag=1;
				break;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if(flag==1) {
			System.out.println("element is found at location "+ mid);
		}
		else {
			System.out.println("element is not found");
		}


	}

}
//if key is left hand side of mid position,  high going changing and if key is rigth hand side low going to changing , mid always increase or decrease change in loop till key found