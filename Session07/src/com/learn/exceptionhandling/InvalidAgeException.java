package com.learn.exceptionhandling;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String str){
		super(str);//indirectly im sending the comment of the ude to the predefined exception constructor which is already defined
	//Exception(str)
	}

	
	

}
