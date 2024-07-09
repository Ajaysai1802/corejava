package com.tnsif.staticexample;

public class Student {
	int rollno;
	String name;
	static String college="SriIndu";
	static void change() {
		college="siiet";
	}
	Student(int i,String n) {
		rollno=i;
		name=n;
	}
	void display() {
		System.out.println(rollno +" " + name +" " + college);
	}
	
	

}
