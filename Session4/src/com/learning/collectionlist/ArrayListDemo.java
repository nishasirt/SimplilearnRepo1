package com.learning.collectionlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		Integer aa[]={10,20,30,40,50};
		Collections.addAll(list, aa);
		
		list.add(55);
		list.add(45);
		list.add(33);
		list.add(23);
		list.add(null);//ALLOw
		list.add(33);
		
		
		System.out.println("list is "+list);
		list.remove(3);
		System.out.println("list remove  is "+list);
		System.out.println("size list is "+list.size());
		System.out.println("Contain "+list.contains(33));
		
		System.out.println("for loop");
		
		for(Integer i: list){
			System.out.println(i);
			
		}
		System.out.println("Iterator");
		Iterator< Integer>  ii=list.iterator();
		
		while(ii.hasNext()){
			
			
			System.out.println(ii.next());
		}
	}

}
