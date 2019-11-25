package com.app.drcl;

public class Thread1 implements Runnable {
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread 1 executed "+ i);
			
		}
	}

}
