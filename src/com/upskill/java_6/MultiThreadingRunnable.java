package com.upskill.java_6;

public class MultiThreadingRunnable implements Runnable {

	public void run(){
	
	try{
		System.out.println("Thread Number # " + Thread.currentThread().getId() + " is Running");
	}	catch(Exception e){
		e.printStackTrace();
		}
	}
}
