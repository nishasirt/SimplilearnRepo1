package com.learn.revisionmethod;

import java.util.Scanner;

public class Assignment5 {

	int sumDigit(int no) {

		String s = String.valueOf(no);

		char[] c;

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {

			sum = sum + Character.getNumericValue(s.charAt(i));

		}

		System.out.println("sum of " + no + " is : " + sum);
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");

		int a = sc.nextInt();

		Assignment5 assignment5 = new Assignment5();

		assignment5.sumDigit(a);

	}

}
