package com.tnsif.staticexample;

public class Employee {
	int eid;
	String name;
	static String company="TNS";
	Employee(int i,String n) {
		eid=i;
		name=n;
	}
	void display() {
		System.out.println(eid +" "+ name +" "+ company);
	}

}
