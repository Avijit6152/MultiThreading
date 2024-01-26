package com.implementingRunnableInterface;

public class ThreadDemo {

	public static void main(String[] args) {

		MyRunnable myRunnable = new MyRunnable();
		
		Thread t=new Thread(myRunnable);
		
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}

}


// RUNNABLE METHOD IS RECOMMENDED TO USE BECAUSE IT FOLLOWS INHERITANCE

class MyRunnable implements Runnable{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("child Thread");
		}
	}
}