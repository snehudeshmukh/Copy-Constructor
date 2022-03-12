package com.learn.java.copyconstructor;

public class TestCopyConstructor {
public static void main(String[] args) {
	Address a1= new Address("Pune","India",12345);
	Student s1= new Student(10,"Ram",a1);
	System.out.println("Student1:"+s1);
	Student s2= new Student(s1);//call to copy constructor
	System.out.println("Student2:"+s2);
	s1.addr.city="Mumbai";
	System.out.println("Student s1 Changed:"+s1);
	System.out.println("Student s2 Changed:"+s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
}
}
