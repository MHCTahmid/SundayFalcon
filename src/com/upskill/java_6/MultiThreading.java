package com.upskill.java_6;



/*MultiThreading is a java feature that allows concurrent execution of two or more parts of a program.*/

/*Threads can be created by using two mechanisms:
	1. Extending the Thread class
	2. Implementing the Runnable Intercase
*/
public class MultiThreading {
	
public static void main(String[] args) {
	int n = 6;
	for(int i = 0; i < n; i++){
	
	MultiThreadingThread obj1 = new MultiThreadingThread();
	obj1.start();
	
	Thread obj2 = new Thread (new MultiThreadingRunnable());
	obj2.start();
	}
}
}
