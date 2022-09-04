package com.learning.abstractt;

public  abstract class Shape {
	
	private String color;
	
	
	public Shape(String color) {
		
		this.color = color;
	}
	
	//getter 
	
	public String getColor() {
		return color;
	}



	



	public abstract double area();

}
