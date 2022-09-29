package com.learn.exceptionhandling;



class ATM
{
	void checkBalance(int accBalance,int withdrawamt)
	{
		if(accBalance<withdrawamt){
			
			new LowBalanceException("Insufficient balance");
		}
		
		
	}
	
	
}

public class AtmClass {
     public static void main(String[] args) {
		
    	 
    	 ATM atm=new ATM();
    	 atm.checkBalance(2000, 3000);
    	 
    	 
	}
}
