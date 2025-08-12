package com.shree;

public class MyRunnable implements Runnable{
	
	public void  run() {
		for (int i=1; i<=5; i++) {
			System.out.println("Thread running :" + i);
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			e.printStackTrace();
			} //2 seconds of sleep/pause 
		}
	}

	public static void main(String[] args) {
		MyRunnable task = new MyRunnable(); // object creation
		Thread t1 = new Thread(task);       // thread creation
		t1.start();
	}

}
