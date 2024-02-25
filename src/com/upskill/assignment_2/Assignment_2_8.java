package com.upskill.assignment_2;

import java.util.Scanner;

/*Write Java Program to display Factorial of Number 7.*/

public class Assignment_2_8 {

	public static void main(String[] args) {
		Factorial();
		
	}

	public static void Factorial(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
			if( i == n){
				System.out.println("The Factorial of " + n + " is: " +fact);
			}
		}
		
	}
	
}
