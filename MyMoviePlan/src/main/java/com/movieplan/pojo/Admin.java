package com.movieplan.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // paramer con
@NoArgsConstructor//  default consstructor
@Entity
public class Admin {
	
	@Id
	private String uname;
    private String password;
}
