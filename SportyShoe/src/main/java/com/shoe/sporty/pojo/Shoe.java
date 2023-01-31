package com.shoe.sporty.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



import lombok.Data;

@Data
@Entity
public class Shoe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String shoeName;
    private double price;
    private String color;
    private String brand;
    
    
    @OneToOne
	@JoinColumn(name="cid")
	private Category category;
    
    
    private String type;
	
    
}
