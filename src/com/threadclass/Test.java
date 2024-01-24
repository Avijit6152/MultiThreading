package com.threadclass;

public class Test {

public static void main(String[] args) {
		
	Mythread2 myThread = new Mythread2();
		myThread.start();
//		myThread.run();       (DIFFERENCE BETWEEN START AND RUN)
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Main Thread");
		}
		
	}

}


class Mythread2 extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Child Thread");
		}
	}
}
