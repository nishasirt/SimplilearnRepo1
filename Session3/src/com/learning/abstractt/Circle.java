package com.learning.abstractt;

public class Circle extends Shape{
	
	private double radis;

	public Circle(String color,double radis) {
		super(color);
		
		this.radis=radis;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radis, 2);
	}
	
	public  String toString()
	{
		return "circle Color is  "+getColor()+",  area of cicle "+area();
	}
}
