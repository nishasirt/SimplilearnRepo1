package com.learning.collectionset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
	
	public static void main(String[] args) {
		// insetion order maintain
		HashSet<String>  hs=new LinkedHashSet<>();
		hs.add("john");
		hs.add("max");
		hs.add("john");
		hs.add("alex");
		hs.add("nisha");
		
		System.out.println(hs);
		
		hs.remove("john");
		System.out.println(hs);
		
		//contain method
		//Ierator
		//size
		
		
	}

}
