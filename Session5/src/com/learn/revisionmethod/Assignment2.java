package com.learn.revisionmethod;

import java.util.Scanner;

public class Assignment2 {

	public int avgNo(int a, int b, int c) {

		return (a + b + c) / 3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st no");
		int a = sc.nextInt();

		System.out.println("enter 2nd no");
		int b = sc.nextInt();

		System.out.println("enter 3rd no");
		int c = sc.nextInt();

		Assignment2 assignment = new Assignment2();

		System.out.println("avg of " + a + " " + b + " " + c + "  is " + assignment.avgNo(a, b, c));

	}
}
