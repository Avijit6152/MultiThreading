package com.threadclass;


public class OverridingStartMethod {

	
public static void main(String[] args) {
		
	Mythread3 myThread = new Mythread3();
		myThread.start();
     System.out.println("Main Thread");
//     myThread.start();   R.E:- java.lang.IllegalThreadStateException
		
	}

}


class Mythread3 extends Thread{
	
	public void run() {
		
			System.out.println("Run Method");
		
	}
	
	
	public void start() {
//		super.start();
		System.out.println("Start Method");
	
}

	
}