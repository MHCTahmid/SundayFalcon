package com.upskill.assignment_2;

public class Assignment_2_1 {

	/*Write a for loop that prints 50 through 1 separated by spaces in the same line.*/
	
	public static void main(String[] args) {
		forLoop(50);

	}

	public static void forLoop(int i){
		while(i >= 1){
			System.out.print("  " + i);
			i--;
		}
	}
}
