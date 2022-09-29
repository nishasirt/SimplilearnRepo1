package com.learn.thread;

interface cus{
	
}

class NumberLoop extends Thread  implements cus

{
	public void run() {

		for (int i = 0; i < 10; i++) {
           System.out.println(i);
		}
	}

}

public class ThreadDemo {
	public static void main(String[] args) {
		
		NumberLoop loop=new NumberLoop();
		loop.start();

	}
}
