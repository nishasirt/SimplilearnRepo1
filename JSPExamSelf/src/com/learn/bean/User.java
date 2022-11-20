package com.learn.bean;

public class User {
   private String name;
   private int age;
   private String email;
   private String password;
   private String gender;
   private String hobbies;
   private String country;
   
   public User(){
	   
   }
   
   
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "User [name=" + name + ", age=" + age + ", email=" + email + ", password=" + password + ", gender=" + gender
			+ ", hobbies=" + hobbies + ", country=" + country + "]";
}
	
	
}
