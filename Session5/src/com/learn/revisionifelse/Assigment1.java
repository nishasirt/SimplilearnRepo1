package com.learn.revisionifelse;

import java.util.Scanner;

public class Assigment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a no");

		int no = sc.nextInt();

		if (no > 0) {
			System.out.println("Number is positive");
		}

		else if (no < 0) {

			System.out.println(" Number is negative");
		} else {

			System.out.println(no + "is zero");
		}
	}

}
