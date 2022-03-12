package com.learn.java.copyconstructor;

public class Address {
	String city;
	String country;
	int pincode;
	public Address() {
		
	}
	public Address(String city,String country,int pin) {
		this.city=city;
		this.country=country;
		this.pincode=pin;
	}
//	Address (Address add){
//		this.city=add.city;
//		this.country=add.country;
//		this.pincode=add.pincode;
//	}
public String toString() {
	return this.city+" "+this.country+" "+this.pincode;
}
}
