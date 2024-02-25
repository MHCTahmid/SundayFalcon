package com.upskill.assignment_1;

public class Assignment_1_2 {
	
	/*A rectangle width and length are: 9 and 13 inches. Write a method to display the perimeter of rectangle in console output.*/

	public static void main(String[] args) {
		perimeter();

	}
	public static void perimeter(){
		int w = 9;
		int l = 13;
		

		int Equation = 2*(w+l);
		
		System.out.println("Perimeter of the triangle is: " + Equation);
	}
}
