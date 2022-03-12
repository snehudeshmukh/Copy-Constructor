package com.learn.java.copyconstructor;

public class Student {
	int rollno;
	String name;
	Address addr;
	public Student() {
		
	}
Student(int roll,String name,Address addr){
	this.rollno=roll;
	this.name=name;
	this.addr=addr;
	
	
}
Student(Student std){
	this.rollno=std.rollno;
	this.name=std.name;
	Address dummyAdd= new Address();//create dummy object of address class
	dummyAdd.city=std.addr.city;
	dummyAdd.country=std.addr.country;
	dummyAdd.pincode=std.addr.pincode;
	this.addr=dummyAdd;
//	Address a1= new Address("Pune","India",12345);//new way also to define
//	this.addr=new Address(a1);//address madhlya constructor la call karnar
//	
}
public String toString() {
	return this.rollno+" "+this.name+" "+this.addr;
}
}
