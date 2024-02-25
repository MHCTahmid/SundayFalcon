package com.upskill.assignment_4;

import java.util.Scanner;

public class Assignment_4_2 {

	/*Write a method which will reverse a string ?*/
	
	
	public static void reverseString(){
		String str = "Hello World";
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}
	
	
	public static void main(String[] args) {
		reverseString();
	}

}
