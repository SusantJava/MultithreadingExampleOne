package com.app.drcl;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int j=0; j<=5;j++) {
			System.out.println("Thread 2 executed "+j);
		}
		
	}

}
