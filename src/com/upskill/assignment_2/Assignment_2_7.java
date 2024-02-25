package com.upskill.assignment_2;

import java.util.Scanner;

/*You are given two integer number (a=25, b=30), write a program to swap them and 
display result on the screen.  */

public class Assignment_2_7 {

	public static void main(String[] args) {
		swapInteger();
	}

	public static void swapInteger() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Your First Integer: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Enter Your Second Integer: ");
		int n2 = scanner.nextInt();
		
		int temp = 0;
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("First integer is: " + n1);
		System.out.println("Second integer is: " + n2);
	}
}
