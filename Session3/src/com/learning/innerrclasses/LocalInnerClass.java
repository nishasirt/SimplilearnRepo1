package com.learning.innerrclasses;

public class LocalInnerClass {

	// class inside method can use method only since it is local class
	public void display() {
		class Inner {

			int a = 10;
              public void print() {

				System.out.println("inner class local");
				System.out.println("inner class local var " + a);
			}

		}

		Inner in = new Inner();
		in.print();

	}

	public static void main(String[] args) {
		LocalInnerClass class1 = new LocalInnerClass();
		class1.display();
	}

}
