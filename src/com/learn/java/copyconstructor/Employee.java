package com.learn.java.copyconstructor;

public class Employee {
	String name;
	int id;
	String address;
	Employee(){
		
	}
	Employee(String name, int id, String addr){
		this.name=name;
		this.id=id;
		this.address= addr;
	}
	Employee (Employee emp){
		this.name=emp.name;
		this.id=emp.id;
		this.address=emp.address;
	
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	

}
