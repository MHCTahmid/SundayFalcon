package com.upskill.assignment_5;

import java.util.Scanner;

public class Assignment_5_3 {

	/*A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
	Write a method that detects if a string is a palindrome.
	Tip: Use word.charAt(i) to get the character at position i.*/
	
	public static boolean isPalindrome(String word){
		int c1 = 0;
		int c2 = word.length() - 1;
		while(c2 > c1){
			if(word.charAt(c1) != word.charAt(c2)){
				return false;
			}
			c1++;
			c2--;
		}
		return true;	
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Word: ");
		String str = s.next();
		System.out.println("The Word is Palindrome: " + isPalindrome(str));
	}
}
