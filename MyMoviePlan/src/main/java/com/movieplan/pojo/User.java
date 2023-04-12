package com.movieplan.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor // paramer con
@NoArgsConstructor//  default consstructor
@Data
public class User {
	@Id
	private String uname;
	private String password;
	private String email;
	private String mobileNo;
	private String address;
	
	@OneToOne
	@JoinColumn(name="bid")
	private Bankk bank;
	
	
	
	
	
	
	

}
