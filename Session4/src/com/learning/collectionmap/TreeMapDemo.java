package com.learning.collectionmap;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
		
		TreeMap<Integer, String> hasmap=new TreeMap<>();
		// asending order on basis of key
		hasmap.put(1, "jack");

		hasmap.put(2, "nisha");
		hasmap.put(5, "shanu");
		hasmap.put(3, "raju");
		
		System.out.println(hasmap);
		System.out.println("contain key 6"+hasmap.containsKey(5));
		
		System.out.println("get value of key 2"+hasmap.get(2));
		
		System.out.println("Iterate for each");
		
		for(Map.Entry<Integer, String>  mp:hasmap.entrySet())
		{
			System.out.println(mp.getKey()+"  "+mp.getValue());
		}
		
		System.out.println("Iterate for Iterator");
		//desc
		NavigableMap<Integer, String> decs=hasmap.descendingMap();
		

		
		Iterator<Map.Entry<Integer, String>>  it=decs.entrySet().iterator();
		
		
		while(it.hasNext()){
			Map.Entry<Integer, String> valu=	it.next();
			
			System.out.println(valu.getKey()+"  "+valu.getValue());
		}
	}


}
