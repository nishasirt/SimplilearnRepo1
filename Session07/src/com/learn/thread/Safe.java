package com.learn.thread;
class Reserve1 implements Runnable {

	int wanted;

	int ava = 5;

	public Reserve1(int wanted) {

		this.wanted = wanted;
	}

	@Override
	public void run() {
		
		synchronized (this) {
			
		
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
			System.out.println("sorry no birth avialable");
		}
		}
	}

}

public class Safe {
	public static void main(String[] args) {
		Reserve1 reserve = new Reserve1(3);

		Thread t1 = new Thread(reserve);

		Thread t2 = new Thread(reserve);
		
		t1.setName("1st person");
		t2.setName("2nd person");

		t1.start();
		t2.start();
	}
}
