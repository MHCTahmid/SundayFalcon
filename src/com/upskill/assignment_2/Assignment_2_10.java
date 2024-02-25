package com.upskill.assignment_2;

import java.util.Scanner;

/*Write a Java program to convert temperature from Fahrenheit to Celsius degree. */

public class Assignment_2_10 {

	public static void main(String[] args) {
		tempCoverter();

	}
	
	public static void tempCoverter(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Temparature in Fahrenheit: ");
		int temp = scanner.nextInt();
		double newTemp; 
		newTemp = (temp - 32) * 0.56;
		
		System.out.println("New Temperature in Celcius is: " + String.format("%.2f%n", newTemp));
		
	}

}
