package com.learning.collectionqueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue< Integer> queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		
		// it will give 1st elemnt
		System.out.println("Peak"+queue.peek());
		
		//it will give 1st elemnt & remove it from queue
		System.out.println("poll"+queue.poll());
		
		System.out.println("peak "+queue.peek());
		
         Iterator<Integer> it=queue.iterator();
		
		while(it.hasNext()){
			
			System.out.println("list is"+it.next());
		}
		
	}

}
