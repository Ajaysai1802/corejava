package com.tnsif.lambdaexpressiondemo;

public class lambdademo {
	
	public static void main(String[] args) {
		
		Message m=()->{return "hello world";};
		System.out.println(m.greet());
	}

}
