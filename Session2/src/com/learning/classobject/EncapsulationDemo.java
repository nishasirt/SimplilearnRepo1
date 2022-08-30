package com.learning.classobject;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		Product product=new Product();
		
		product.setId(5);
		product.setName("Pen");
		product.setPrice(50.6);
		product.setDes("good pen");
		
		System.out.println("id is "+product.getId());
		System.out.println("name is "+product.getName());
		System.out.println("product price is "+product.getPrice());
		System.out.println("desc is "+product.getDes());
	}

}
