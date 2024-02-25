package com.upskill.assignment_2;

/*Write two java functions which will return two different integer values, write a 
	     program to compare those numbers and send message that one number is bigger 
	     than other. (hints: using if..else)*/


public class Assignment_2_3 {

	public static void main(String[] args) {
		compare();
	}
	
	public static void compare(){
		if(integerOne() > integerTwo()){
			System.out.println( integerOne() + " is Bigger Than " + integerTwo());
		}
		else{
			System.out.println( integerTwo() + " is Bigger Than " + integerOne());
		}
		
	}
	
	
	public static int integerOne(){
		int i = 30;
		return i;
	}
	
	public static int integerTwo(){
		int j = 40;
		return j;
	}

}
