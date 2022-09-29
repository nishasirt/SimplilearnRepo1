package com.learn.thread;

class Abc implements Runnable {

	String str;

	public Abc(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			odd();
			// even();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void odd() throws InterruptedException {
		for (int i = 1; i < 10; i++) {
			System.out.println(str + i);
			Thread.sleep(4000);
		}

	}

	public void even() {
		for (int i = 1; i < 10; i++) {
			System.out.println("even" + i);

		}
	}

}

public class UsingRunnable {
	public static void main(String[] args) {

		Abc abc = new Abc("hello ");
		Thread t = new Thread(abc);
		t.start();
		System.out.println(Thread.currentThread());
		Abc abc1 = new Abc("hi ");
		Thread t2 = new Thread(abc1);
		t2.start();

	}
}
