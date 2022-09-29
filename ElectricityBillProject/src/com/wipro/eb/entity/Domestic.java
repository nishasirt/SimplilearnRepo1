package com.wipro.eb.entity;

public class Domestic extends Connection {

	public Domestic(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		
		float finalamt=0.0f;
		
		int unitconsumed=currentReading-previousReading;
		
		if(unitconsumed<=50){
			finalamt=unitconsumed*slabs[0];
			
		} else if(unitconsumed>50&&unitconsumed<=100)
		{
			
			finalamt=50*slabs[0]+(unitconsumed-50)*slabs[1];
		}
		else{
			finalamt=50*slabs[0]+50*slabs[1]+(unitconsumed-100)*slabs[2];
		}
		
		return finalamt;
	}

}
