package com.kitchen.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class FoodItem {
	
	@Id
	private int fid;
	private String foodName;
	private double price;
	private double offer;
	private String description;
	private String type;
	private String cname;
	
 
	

}
