package com.tnsif.multithreading;
public class Implementingrunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementingrunnable r=new Implementingrunnable();
		Thread T1=new Thread(r);
		T1.start();
		

	}
	@Override
	public void run() {
		System.out.println("implementing runnable interface");
	}

}
