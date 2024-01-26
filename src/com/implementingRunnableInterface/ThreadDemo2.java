package com.implementingRunnableInterface;

public class ThreadDemo2 {
	
	public static void main(String[] args) {

		MyRunnable2 myRunnable2 = new MyRunnable2();
		
		Thread t1=new Thread();
		
		Thread t2=new Thread(myRunnable2);
		
//		t1.start();
//		t1.run();
//		t2.start();
//		t2.run();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}

}


// RUNNABLE METHOD IS RECOMMENDED TO USE BECAUSE IT FOLLOWS INHERITANCE

class MyRunnable2 implements Runnable{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("child Thread");
		}
	}

}
