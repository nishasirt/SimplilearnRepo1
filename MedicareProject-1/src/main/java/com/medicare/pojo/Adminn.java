package com.medicare.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Adminn {
	@Id
	@Column(name="id")
	private String uname;
	private String password;
}
