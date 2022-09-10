package com.learn.revisionifelse;

import java.util.Scanner;

public class LeapYear {

	void leapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {

				if (year % 400 == 0) {
					System.out.println("Year is leap year");
				} else {
					System.out.println("Year is not leap year");
				}

			}
             else {
				System.out.println("Year is not leap year");
			}

		} else {
			System.out.println("Year is not leap year");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a year");

		int yr = sc.nextInt();

		LeapYear lp = new LeapYear();

		lp.leapYear(yr);

	}

}
