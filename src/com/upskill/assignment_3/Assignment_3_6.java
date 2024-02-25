package com.upskill.assignment_3;

import java.util.Scanner;

/*Write a java program which will count the number of vowels, consonants, digits, tabs and blank spaces from a string “A quick brown fox jumps over the lazy dog”.*/


public class Assignment_3_6 {
	
	public static void charFinder(String str){
		str = str.toLowerCase();
		
		int vowel = 0;
		int consonant = 0;
		int digit = 0;
		int tab = 0;
		int space = 0;
		
		for(char ch: str.toCharArray()){
			if(Character.isLetter(ch)){
				if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
					vowel++;
				}
				else
					consonant++;
			}
			else if(Character.isDigit(ch)){
				digit++;
			}
			else if(ch == '\t'){
				tab++;
			}
			else if(ch == ' '){
				space++;
			}
		}
		System.out.println("Vowels: " + vowel);
		System.out.println("Consonants: " + consonant);
		System.out.println("Digits: " + digit);
		System.out.println("Tabs: " + tab);
		System.out.println("Blank Space: " + space);
		
	}
	
	
	
	public static void main(String[] args) {
		
		String input = "A quick brown fox jumps over the lazy dog 1";
		charFinder(input);
		
	}

}
