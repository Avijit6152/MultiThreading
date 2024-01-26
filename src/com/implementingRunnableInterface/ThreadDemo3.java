package com.implementingRunnableInterface;

public class ThreadDemo3 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		MyThread t=new MyThread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Avijit");
		
		System.out.println(Thread.currentThread().getName());

	}

}

class MyThread extends Thread{}