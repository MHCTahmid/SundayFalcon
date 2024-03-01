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
	
	
//	Git Change
	
//	Changes for Git Pull Request Practice
	
	
	protected static void demo2(){
		System.out.println("Demo 2 Method for Singleton class");
	}
	
}
