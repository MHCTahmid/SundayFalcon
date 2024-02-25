package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iColor() {
		System.out.println("My car has Red color"); 
	}

	@Override
	public void iDoor() {
		System.out.println("My car has 4 Doors"); 
		
	}

	@Override
	public int iWheel() {
		int wheel = 4;
		return wheel;
	}

	@Override
	public String iEngine() {
		String engine = "4HP";
		return engine; 
	}

}
