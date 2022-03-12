package com.learn.java.copyconstructor;

public class ImmutableCopyConstructor {
	public static void main(String[] args) {
		Employee e1= new Employee("Sham",123,"Pune");
		System.out.println("Employee e1:"+e1);
		Employee e2= new Employee(e1);
		System.out.println("Emplyee e2:"+e2);
		e1.address="Mumbai";
		System.out.println("Employee e1 after changed:"+e1);
		System.out.println("Employee e2 after changed:"+e2);

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

}
