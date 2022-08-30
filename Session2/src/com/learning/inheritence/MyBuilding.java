package com.learning.inheritence;

public class MyBuilding implements BuildingInterface{

	@Override
	public void oneBhk() {
		
		System.out.println("one room hall kitchen flat");
	}

	@Override
	public void twoBhk() {
		
		System.out.println("two bed room hall  flat");
	}

	@Override
	public void threeBhk() {
		// TODO Auto-generated method stub
		System.out.println("three bed room hall  flat");
	}

	@Override
	public void rk() {
		// TODO Auto-generated method stub
		System.out.println("only bed room kitchwn  flat");
	}

}
