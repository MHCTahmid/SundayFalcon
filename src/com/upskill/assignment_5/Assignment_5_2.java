package com.upskill.assignment_5;

import java.util.Scanner;

public class Assignment_5_2 {

	public static boolean isPalindrome(String word){
		int i1 = 0;
		int i2 = word.length() -1;
		
		while(i2 > i1){
			if(word.charAt(i1) != word.charAt(i2)){
				return false;
			}
			i1++;
			i2--;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Word: ");
		String word = s.next();
		System.out.println(isPalindrome(word));

	}

}
