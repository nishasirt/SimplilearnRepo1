package com.learn.revisionmethod;

import java.util.Scanner;

public class Assignment1 {

	public void smallestNum(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println("a is smallest");
		} else if (b < a && b < c) {
			System.out.println("b is smallest");
		} else {
			System.out.println("c is smallest");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st no");
		int a = sc.nextInt();

		System.out.println("enter 2nd no");
		int b = sc.nextInt();

		System.out.println("enter 3rd no");
		int c = sc.nextInt();

		Assignment1 assignment1 = new Assignment1();
		assignment1.smallestNum(a, b, c);

	}

}
