package com.upskill.assignment_4;

import java.util.Arrays;

public class Assignment_4_3 {

	/*Write a method which return count of duplicate value from a array?*/
	
	public static void duplicateArray(int arr[]){
		Arrays.sort(arr);
		
		for(int i=0; i < arr.length; i++){
			int count = 1;
			for(int j=i+1; j < arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
				else
					break;
			}
			System.out.println(arr[i] + " is repeated " + count + " time");
			i += (count-1); 
		}
	}
	
	public static void main(String[] args) {
		int array[] = {4, 5, 1, 8, 4, 6, 1, 100, 2, 4, 1, 1, 2, 2, 5, 7, 8, 9, 11};
		duplicateArray(array);
	}
}
