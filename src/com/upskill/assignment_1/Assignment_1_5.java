package com.upskill.assignment_1;

public class Assignment_1_5 {

	/*Write a java program which will display name and guestimated age of every students in your class.(write separate method for every student).*/
	
	public static void main(String[] args) {
		
		Assignment_1_5 object = new Assignment_1_5();
		
		System.out.println("The age of Student 01 is: " + object.StudentOne());
		System.out.println("The age of Student 02 is: " + StudentTwo());
		System.out.println("The age of Student 03 is: " + StudentThree());

	}

	public int StudentOne(){
		return 24;
	}
	
	public static int StudentTwo(){
		return 25;
	}
	public static int StudentThree(){
		return 26;
	}
}
