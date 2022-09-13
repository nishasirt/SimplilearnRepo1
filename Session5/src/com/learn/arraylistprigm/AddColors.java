package com.learn.arraylistprigm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class AddColors {
	public static void main(String[] args) {
		
		
		ArrayList<String> arrCol=new ArrayList<>();
		arrCol.add("red");
		arrCol.add("green");
		arrCol.add("Yello");
		arrCol.add("white");
		arrCol.add("black");
		arrCol.add(0, "Pink");
		System.out.println("actual list "+arrCol);
		Collections.shuffle(arrCol);
		System.out.println("Shuffle list "+arrCol);
		
		Iterator<String> it=arrCol.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<String>  fir3element=new ArrayList<>();
		
		fir3element=(ArrayList<String>) arrCol.stream().limit(3).collect(Collectors.toList());
		
		System.out.println("first 3 element"+fir3element);
		
		
	}

}
