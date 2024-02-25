package com.upskill.assignment_2;

import java.util.Scanner;

/*Write a program to swap two string variables (Talen, Tech) and display result on the 
screen.   */

public class Assignment_2_9 {

	public static void main(String[] args) {
		swapString();

	}
	
	public static void swapString(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Your First String: ");
		String s1 = scanner.next();
		System.out.print("Enter Your Second String: ");
		String s2 = scanner.next();
		
		String temp = "";
		
		temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);
	}

}
