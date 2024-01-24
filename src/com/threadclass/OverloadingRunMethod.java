package com.threadclass;


public class OverloadingRunMethod {
	
public static void main(String[] args) {
		
		Mythread myThread = new Mythread();
		myThread.start();

		
	}

}


class Mythread extends Thread{
	
	public void run() {
		
		
			
			System.out.println("No Args Method");
		
	}
	
	
	public void run(int i) {
		
		
		
		System.out.println("Int Args Method");
	
}

}
