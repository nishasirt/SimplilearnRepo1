package com.learning.collectionset;


import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		// asending sorted order maintain bydefault
		SortedSet<String>  hs=new TreeSet<>();
		hs.add("john");
		hs.add("max");
		hs.add("john");
		hs.add("alex");
		hs.add(null);//not ALLOw
		hs.add("nisha");
		
		System.out.println(hs);
		
		hs.remove("john");
		System.out.println(hs);
		
		//assignment
		
		//contain method
		System.out.println("John contain in  set  "+hs.contains("john"));
		//Ierator
		
		System.out.println("iteraor ");
		Iterator<String> it=hs.iterator();
		
		//iterator can not use multiple time
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//size
		System.out.println("size of set "+hs.size());
		
		// for desecending order
		
		SortedSet<String>  ss=((TreeSet<String>)hs).descendingSet();
		
		System.out.println("desending order"+ss);
		
		
	}
}
