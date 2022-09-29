package com.learning.collectionmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {
public static void main(String[] args) {
	// thread safe
		
		Map<Integer, String> hasmap=new Hashtable();
		
		hasmap.put(1, "jack");

		hasmap.put(2, "nisha");
		hasmap.put(5, "shanu");
		hasmap.put(3, "raju");
		//hasmap.put(null, null);//not allow null key or valuue
		//hasmap.put(null, "kk");
		System.out.println(hasmap);
		System.out.println("contain key 6"+hasmap.containsKey(5));
		
		System.out.println("get value of key 2"+hasmap.get(2));
		
		System.out.println("Iterate for each");
		
		for(Map.Entry<Integer, String>  mp:hasmap.entrySet())
		{
			System.out.println(mp.getKey()+"  "+mp.getValue());
		}
		
		System.out.println("Iterate for Iterator");
		
		Iterator<Map.Entry<Integer, String>>  it=hasmap.entrySet().iterator();
		
		
		while(it.hasNext()){
			Map.Entry<Integer, String> valu=	it.next();
			
			System.out.println(valu.getKey()+"  "+valu.getValue());
		}
	}

}
