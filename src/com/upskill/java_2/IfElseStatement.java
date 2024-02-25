package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int age = 100;
		
		if(age <= 13){
			System.out.println("You are Children");
		}
		else if(age < 18){
			System.out.println("You are a Teenager");
		}
		else if(age >= 60){
			if(age < 100){
				System.out.println("You are Senior");
			}
			else{
			System.out.println("You are Champion");
			}
		}
		else{
			System.out.println("You are Adult");
		}
	}
}
