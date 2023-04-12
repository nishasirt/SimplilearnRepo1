package com.ex;

@FunctionalInterface
public interface Mynew {
	
	void showname(String name);
	
	
	default int add(int a,int b){
		
		
		return a+b;
	}

}
