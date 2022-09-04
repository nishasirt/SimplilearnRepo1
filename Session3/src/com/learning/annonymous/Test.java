package com.learning.annonymous;

public class Test {
public static void main(String[] args) {
	Car myCar=new Car() {
		
		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("stop my car");
		}
		
		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("start my car");
		}
	};
	myCar.start();
	myCar.stop();
	
	Car shaCar=new Car() {
		
		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("stop shanya car");
		}
		
		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("start shanya car");
		}
	};
	shaCar.start();
	shaCar.stop();
	
}
}
