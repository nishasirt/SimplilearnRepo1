package com.learning.projectassignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationProgram2 {

	public static void main(String[] args) {

		String[] emailList = { "nisha@gmail.com", "Shanu.ch@Yahoo.com", "rahul.rahangdale3@gmail.com",
				"yash@rediffmail.com", "abcd@gmail.com", "laddu.om@idbi.in", "xyz@gmail.com", "lokesh.ch86@gamil.com" };
		

		String flag = null;
		// Taking email from user
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter a Email ID");

			String email = sc.next();

			for (int i = 0; i < emailList.length; i++) {

				if (emailList[i].equalsIgnoreCase(email)) {

					flag = "yes";

					break;
				} else {

					flag = "no";

				}

			}

			if (flag.equalsIgnoreCase("yes")) {
				System.out.println("Email id is in the list");

				break;
			} else {
				System.out.println("Email id is not is in the list");
			}

		}

	}
}