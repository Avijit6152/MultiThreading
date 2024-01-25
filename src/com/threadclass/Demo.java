package com.threadclass;

public class Demo {

	public static void main(String[] args) {
		
		PracticeThread practiceThread = new PracticeThread();
		practiceThread.start();   //IF START METHOD IS INVOKED THEN ANOTHER THREAD IS CREATED.
		
		PracticeThread2 practiceThread2 = new PracticeThread2();
		practiceThread2.start();   //ORDER OF EXECUTION IS DIFFERENT
		
		
//		practiceThread.run();   //IF RUN METHOD IS EXECUTED THEN ONLY ONE THREAD IS USED.
		System.out.println("Main Thread");
		
		
		PracticeThread3 practiceThread3 = new PracticeThread3();
		practiceThread3.start();   //ORDER OF EXECUTION IS DIFFERENT
		
		System.out.println("MAIN METHOD");
	}

}


class PracticeThread extends Thread{
	
//	public void start() {           //INSIDE START METHOD RUN METHOD IS PRESENT AUTOMATTICALLY.
//		super.start();
//		System.out.println("Start Method");
//	}
	
	public void run() {
		
		System.out.println("PracticeThread Run Method");
	}
}


class PracticeThread2 extends Thread{
	
	public void run() {
		
		System.out.println("PracticeThread2 Run Method");
		
	}
	
}



class PracticeThread3 extends Thread{
	
	public void run() {
		
		System.out.println("PracticeThread3 Run Method");
	}
	
}