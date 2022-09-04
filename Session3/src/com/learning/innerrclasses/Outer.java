package com.learning.innerrclasses;

public class Outer {

	private int num = 10;

	class Inner {

		int inner = 30;

		void display() {

			System.out.println("inner calls method");
			System.out.println("Outer clss var" + num);

			System.out.println("inner class object" + inner);

		}

		class Depth {

			void print() {
				System.out.println("depth calss");
			}
		}

	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner in = outer.new Inner();

		in.display();

		Outer.Inner.Depth de = in.new Depth();

		de.print();
	}
}
