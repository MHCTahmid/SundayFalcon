package com.upskill.assignment_5;

public class Assignment_5_1 {

	/*
	 * Write a method that returns the largest integer in the list. You can
	 * assume that the list has at least one element.
	 */

	public static int largestInt(int [] list){
		int large = 0;
		for(int i: list){
			if(i > large){
				large = i;
			}
		}
		return large;
		
	}
	
	public static void main(String[] args) {

		int[] list = new int[] { 15, 20, 95, 59, 10, 8 };
		System.out.println("Largest Integer in the list is: " + largestInt(list));
	}

}

