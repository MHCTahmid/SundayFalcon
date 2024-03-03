package com.upskill.assignment_5;

import java.util.Scanner;

/*Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.*/

public class Assignment_5_2 {

	public static void fizzBuzz(){
		System.out.print("Enter a Number: ");
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		
		if(in % 3 == 0){
			if(in % 5 == 0){
				System.out.println("FizzBuzz");
			}
			else{
				System.out.println("Fizz");
			}
		}
		else if(in % 5 == 0){
			System.out.println("Buzz");
		}
		else{
			System.out.println("Invalid Number");
		}
	}
	
	
	public static void main(String[] args) {
		fizzBuzz();
	}

}
