package com.learning.abstractt;

public class Rectangle extends Shape{
	
	private double length;
	private double width;
	public Rectangle(String color,double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	public  String toString()
	{
		return "Rec Color is  "+getColor()+",  area of rec "+area();
	}
	 
	

}
