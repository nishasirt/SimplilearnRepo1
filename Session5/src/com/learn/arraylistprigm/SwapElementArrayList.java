package com.learn.arraylistprigm;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElementArrayList {
	
	public static void main(String[] args) {
		

		ArrayList<String> arrCol=new ArrayList<>();
		arrCol.add("red");
		arrCol.add("green");
		arrCol.add("Yellow");
		arrCol.add("white");
		arrCol.add("black");
		arrCol.add(0, "Pink");
		System.out.println(arrCol);
		
		Collections.swap(arrCol, 0, 2);
		System.out.println(arrCol);
		
		ArrayList<String>  arrCol1=new ArrayList<>();
		
		arrCol1=(ArrayList<String>) arrCol.clone();
		
		System.out.println("cloning :"+arrCol1);
		
		arrCol1.removeAll(arrCol1);
		
		System.out.println("remove :"+arrCol1);
		
		
	}

}
