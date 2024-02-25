package com.upskill.assignment_4;

import java.util.Scanner;

/*Write a method to check leap year?*/

public class Assignment_4_4 {

	public static void main(String[] args) {
		System.out.print("Enter a Year: ");
		leapYearFinder();
	}
	
	public static void leapYearFinder(){
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		boolean leapYear = false;
		if(y%4 ==0){
			if(y%100 == 0){
				if(y%400 == 0){
					leapYear = true;
				}
				else{
					leapYear = false;
				}
			}
			else{
				leapYear = true;
			}
		}
		else{
			leapYear = false;
		}
		if(leapYear == true){
			System.out.println( y + " is a Leap Year");
		}
		else{
			System.out.println( y + " is not a Leap Year");
		}
	}

}
