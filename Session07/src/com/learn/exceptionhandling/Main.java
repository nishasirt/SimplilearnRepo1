package com.learn.exceptionhandling;

class AgeValidate
{
	void ageValidation(int age) throws InvalidAgeException {
		if(age>=18) {
			System.out.println("hey u have right to vote");
		}
		else {
			//raise a user defined exception
			throw new InvalidAgeException("invalid age no right to vote");
		}
	}

	
	
}

public class Main {
	
	public static void main(String[] args) throws InvalidAgeException  {
		
		AgeValidate ageValidate=new AgeValidate();
		ageValidate.ageValidation(45);
		
	}

}
