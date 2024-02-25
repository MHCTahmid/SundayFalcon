package com.upskill.assignment_1;

public class Assignment_1_4 {
	
	/*A function returns 30, another function returns 50. Write a java program which will display subtraction value from bigger number to smaller.*/

	public static void main(String[] args) {
		subtraction();

	}

	public static int functionOne(){
		return 30;
	}
	public static int functionTwo(){
		return 50;
	}
	
	public static void subtraction(){
		int sub = Math.abs(functionOne() - functionTwo());
		System.out.println("Answer is: " + sub);
	}
}
