package com.upskill.assignment_2;


/*Write a for loop upto 500 which will increase the value double every time.*/

public class Assignment_2_4 {

	public static void main(String[] args) {
		forLoop();
	}

	public static void forLoop(){
		for(int i = 1; i <= 500; i *= 2){
			System.out.print(i + " ");
		}
	}
	
}
