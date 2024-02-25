package com.upskill.java_1;

public class AccessModifier {

	public String name = "Tahmid";          /*Any Class can Access*/
	
	private int age = 24;					/*Only same class can Access*/
	
	protected int ssn = 123456;				/*classes in the same package and subclass*/
	
	String address = "Heritage Tower";		/*default - classes in same package can access*/
	

}
