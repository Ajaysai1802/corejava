package com.tnsif.final1;

public class Finalname {
	final int a=10;
	
	static final int y=6;
	final void change() {
		System.out.println("default");
		static {
			y=5;
		}
	}

}
