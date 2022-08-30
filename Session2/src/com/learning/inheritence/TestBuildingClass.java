package com.learning.inheritence;

public class TestBuildingClass {
  public static void main(String[] args) {
	
	  //Abstraction
	  //hide complex functionality from user show only main 
	  BuildingInterface bi=new MyBuilding();
	  
	  bi.rk();
	  bi.oneBhk();
	  bi.twoBhk();
	  bi.threeBhk();
}
}
