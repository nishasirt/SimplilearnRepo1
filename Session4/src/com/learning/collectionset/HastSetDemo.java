package com.learning.collectionset;

import java.util.HashSet;

public class HastSetDemo {
	
	public static void main(String[] args) {
		// no order maintain
		HashSet<String>  hs=new HashSet<>();
		hs.add("john");
		hs.add("max");
		hs.add("john");
		hs.add("alex");
		hs.add(null);//ALLOw
		hs.add("nisha");
		
		System.out.println(hs);
		
		hs.remove("john");
		System.out.println(hs);
		
		//contain method
		//Ierator
		//size
		
		
	}

}
