package com.wipro.eb.service;

import com.wipro.eb.entity.Connection;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService {
	
	public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException
	{
		
		int reading=currentReading-previousReading;
		boolean result=false;
		boolean contype=false;
		boolean conreading=false;
		
		
		if(currentReading<previousReading||reading<0){
			
			throw new InvalidReadingException();
			
		}else
			
		{
			conreading=true;
		}
			
			if(!type.equalsIgnoreCase("Domestic")||!type.equalsIgnoreCase("Commercial"))
		{
			throw new InvalidConnectionException();
		}
			
		
		else {
			contype= true;
		}
			
			
			if(conreading&&contype){
				result=true;
			}
		
		return result;
	}
	
	
	public float calculateBillAmt(int currentReading, int previousReading, String type){
		boolean resul=false;
		
	     float billamt;
		try {
			resul=validate(currentReading, previousReading, type);
		} catch (InvalidReadingException e) {
			// TODO Auto-generated catch block
			
			return -1;
			
		}
		catch (InvalidConnectionException e) {
			// TODO Auto-generated catch block
			return -2;
		}
		
		if(resul==true)
		{
			
			if(type.equalsIgnoreCase("Domestic"))
			{
				
				
				Connection con=new Domestic(previousReading, currentReading,  new float[] {2.3f,4.2f,5.5f});
			}
			
		}
		
		
		
		
		return 0;
		
	}

}
