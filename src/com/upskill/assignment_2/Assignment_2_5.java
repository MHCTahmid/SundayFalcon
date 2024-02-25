package com.upskill.assignment_2;

import java.util.Scanner;

/*Write a program in Java to display the multiplication table of (eight)8.*/

public class Assignment_2_5 {

	public static void main(String[] args) {
		
		multiplicationTable();
	}

	public static void multiplicationTable(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int n = scanner.nextInt();
		
		System.out.println("multiplication table of " + n + "is: ");
		for(int i = 1; i <= 10; i++){
			int r = i*n;
			System.out.println(n + " x " + i + "  =  " +r);
		}
	}
	
}


