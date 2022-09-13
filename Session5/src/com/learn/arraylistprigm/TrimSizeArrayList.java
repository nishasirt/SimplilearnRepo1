package com.learn.arraylistprigm;

import java.util.ArrayList;

public class TrimSizeArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  datalist=new ArrayList<>(9);
		
		datalist.add(22);
		datalist.add(33);
		datalist.add(44);
		datalist.add(55);
		datalist.add(66);
		
		System.out.println("org size   :  "+datalist.size());
		
		datalist.trimToSize();
		
		
		System.out.println("trimmed size  :   "+datalist.size());
		
	}

}
