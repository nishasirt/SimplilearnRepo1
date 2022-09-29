package com.learn.thread;

class Reserve implements Runnable {

	int wanted;

	int ava = 5;

	public Reserve(int wanted) {

		this.wanted = wanted;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("avail birth " + ava);

		if (ava > wanted) {

			System.out.println("  birth reserve :" + Thread.currentThread().getName());
             ava=ava-wanted;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			System.out.println("so no birth avialable");
		}

	}

}

public class Unsafe {

	public static void main(String[] args) {

		Reserve reserve = new Reserve(3);

		Thread t1 = new Thread(reserve);

		Thread t2 = new Thread(reserve);
		
		t1.setName("1st person");
		t2.setName("2nd person");

		t1.start();
		t2.start();

	}
}
