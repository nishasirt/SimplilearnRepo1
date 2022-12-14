package com.wipro.eb.main;

import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;

public class EBMain {
	
	public static void main(String[] args) throws InvalidReadingException, InvalidConnectionException {
		System.out.println(new ConnectionService().generateBill(320, 200, "Commercial"));
		
		
		
		System.out.println(new ConnectionService().generateBill(100, 70, "Domestic"));
		
		System.out.println(new ConnectionService().generateBill(100, 30, "Domestic"));
		
		System.out.println(new ConnectionService().generateBill(200, 70, "Domestic"));
		
		
		System.out.println(new ConnectionService().generateBill(320, 490, "Commercial"));
		
		System.out.println(new ConnectionService().generateBill(320, 240, "Commercial"));
		
	}

}
