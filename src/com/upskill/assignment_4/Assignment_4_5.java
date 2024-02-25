package com.upskill.assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4_5 {

	/*Check whether two strings are anagram of each other from an array?*/
	
	
	public static void main(String[] args) {
		anagram();
	}
	
	public static void anagram(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter First String: ");
		String s1 = s.next();
		
		System.out.print("Enter Second String: ");
		String s2 = s.next();
		
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String sortedString1 = new String(arr1);
		String sortedString2 = new String(arr2);
		
		if(sortedString1.equals(sortedString2)){
			System.out.println("Anagram"); 
		}
		else{
			System.out.println("Not An Anagram"); 
		}
		
	}
	
	
}
