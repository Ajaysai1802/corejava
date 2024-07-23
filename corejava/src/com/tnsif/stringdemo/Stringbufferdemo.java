package com.tnsif.stringdemo;

public class Stringbufferdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b=new StringBuffer("Welcome");
		b.append("to java");
		System.out.println(b);
		b.insert(1,"hj");
		System.out.println(b);
		b.delete(1, 3);
		System.out.println(b);
		System.out.println(b.reverse());

	}

}
