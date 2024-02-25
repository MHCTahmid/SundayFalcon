package com.upskill.assignment_3;

import com.upskill.java_1.MthodType;

public class Assignment_3_4 extends MthodType {

	public void annualIncome(){	
		int calculateAnnualIncome = hourlyIncome * 2000;/*Void Method*/
		int bonus = 10000;
		int rent = 20000;
		int total = calculateAnnualIncome + bonus + rent;
		System.out.println("My Annual Income = " + total);
	}
	
	
	public static void main(String[] args) {
		Assignment_3_4 obj = new Assignment_3_4();
		obj.annualIncome();
		
		

	}
	
	

}
