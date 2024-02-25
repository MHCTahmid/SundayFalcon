package com.upskill.assignment_2;

import java.util.Scanner;

/*A school conducts a 100 mark exam for its student and grades them as follows:
 	Grade:
 		Grade A: Marks>=90
 		Grade B: Marks>=80-89
 		Grade C: Marks>=70-79
 		Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60

     Write a java program to calculate the grade for a student in a method passing 
     parameter for grade to display every grade type, using if..else statement.*/

public class Assignment_2_2 {

	public static void main(String[] args) {
		gradeFunction();

	}

	public static void gradeFunction() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total Marks of the Student: ");
		int n = scanner.nextInt();
		if(n < 60){
			if(n < 0){
				System.out.println("Invalid Input");
			}
			else{
				System.out.println("Fail");
			}
		}
		else if(n >=60 && n <= 69){
			System.out.println("Grade D");
		}
		else if(n >= 70 && n <= 79){
			System.out.println("Grade C");
		}
		else if(n >= 80 && n <= 89){
			System.out.println("Grade B");
		}
		else{
			if(n <= 100){
				System.out.println("Grade A");
			}
			else{
				System.out.println("Invalid Input");
			}
		}
	}
}