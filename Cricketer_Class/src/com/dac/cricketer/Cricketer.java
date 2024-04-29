package com.dac.cricketer;

public class Cricketer {
private String name;
private int age;
private String emailId;	
private String phone;
private int rating;
/**
 * @param name
 * @param age
 * @param emailId
 * @param phone
 * @param rating
 */
public Cricketer(String name, int age, String emailId, String phone, int rating) {
	super();
	this.name = name;
	this.age = age;
	this.emailId = emailId;
	this.phone = phone;
	this.rating = rating;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Cricketer [name=" + name + ", age=" + age + ", emailId=" + emailId + ", phone=" + phone + ", rating="
			+ rating + "]";
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
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}	











	
}
