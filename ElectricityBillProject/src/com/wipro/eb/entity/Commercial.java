package com.wipro.eb.entity;

public class Commercial extends Connection {

	float finalamt = 0.0f;

	public Commercial(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub

		int unitconsumed = currentReading - previousReading;
		float electribill = 0;

		if (unitconsumed <= 50) {
			finalamt = unitconsumed * slabs[0];

		} else if (unitconsumed > 50 && unitconsumed <= 100) {

			finalamt = 50 * slabs[0] + (unitconsumed - 50) * slabs[1];
		} else {
			finalamt = 50 * slabs[0] + 50 * slabs[1] + (unitconsumed - 100) * slabs[2];
		}

		if (finalamt >= 10000) {

			float ed = (float) (finalamt * 0.09);
			finalamt = finalamt + ed;
		}
		else if (finalamt >= 5000&&finalamt<10000) {

			float ed = (float) (finalamt * 0.06);
			electribill = finalamt + ed;
		}else {
			float ed = (float) (finalamt * 0.02);
			electribill = finalamt + ed;
		}
		
		
		return electribill;
	}

}
