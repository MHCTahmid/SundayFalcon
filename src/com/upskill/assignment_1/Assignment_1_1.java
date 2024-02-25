package com.upskill.assignment_1;

public class Assignment_1_1 {
	
	/*A triangle three arms are: 5, 7 and 11 inches. Write a method to display the perimeter of triangle in console output.*/

	public static void main(String[] args) {
		perimeter();

	}
	
	public static void perimeter(){
		int armOne = 5;
		int armTwo = 7;
		int armThree = 11;

		int formula_Of_Perimeter = armOne + armTwo + armThree;
		
		System.out.println("Perimeter of the triangle is: " + formula_Of_Perimeter);
	}

}
