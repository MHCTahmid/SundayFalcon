package com.upskill.assignment_2;

import java.util.Scanner;

/*Write a java program to find the prime number from 1 to 100 and print them.*/

public class Assignment_2_6 {

	public static void main(String[] args) {
		primeNumber();
	}

	public static void primeNumber(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter max Limit: ");
		int n = scanner.nextInt();
		System.out.println("All the Prime numbers from 1 to " + n + " is:");
		for(int i = 2; i <= n; i++){
			boolean isPrime = true;
			for(int j = 2; j <= i/2; j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.print(i + " ");
			}
		}
	}
	
}
