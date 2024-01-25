package com.threadclass;

public class Demo2 {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.start();
		
		Thread2 thread2 = new Thread2();
		thread2.start();

//		thread1.run();
		System.out.println("Main Thread");
	}

}



class Thread1 extends Thread{
	
	public void run() {
		
		for(int i=0;i<=20;i++) {
		System.out.print(" "+i+" ");
		}
	}
}

class Thread2 extends Thread{
	
	public void run() {
		
		for(int i=20;i<=50;i++) {
		System.out.print(" "+i+" ");
		}
	}
}