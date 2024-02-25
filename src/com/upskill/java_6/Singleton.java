package com.upskill.java_6;

/*Singleton is class that can have one object*/


public class Singleton {

	private Singleton(){
		
	}
	
	private static Singleton obj = new Singleton();
	
	public static Singleton getInstance(){
		return obj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
	
}
