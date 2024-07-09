package com.tnsif.staticexample;

public class Demo1 {

	public static void main(String[] args) {
	
		Student s1=new Student(1,"vtk");
		s1.display();
		Student.change();
		Student s=new Student(1,"vtk");
		s.display();
		

	}

}
