package com.app.drcl;

public class MasterThread {

	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();
		
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		
		obj1.start();
		obj2.start();
		

	}

}
