package com.upskill.assignment_1;

public class Assignment_1_3 {
	
	/* A function which returns the multiply value of a and b where a = 9 and b = 11.      Write a program which will display addition of a +b + function returns value.*/

	public static void main(String[] args) {
		addition();
	}
	
	static int a = 9;
	static int b = 11;
	public static int newFunction(){
		int fun = a*b;
		return fun; 
	}
	
	public static void addition(){
		int add = a + b + newFunction();
		System.out.println("Addtion of a,b and new function is: " + add );
	}

	
}
