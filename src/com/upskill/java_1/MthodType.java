package com.upskill.java_1;

public class MthodType extends Variables {
	
	

	public static void main(String[] args) {
		
		MthodType obj = new MthodType();
		
		obj.annualIncome();
		System.out.println("My Monthly Income = " + obj.monthlyIncome());
		weeklyIncome();
		
	}
	
	public static int  hourlyIncome = 65;
	
	public void annualIncome(){														/*Void Method*/
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	public int monthlyIncome(){														/*Return Type*/
		int calculateMonthlyIncome = hourlyIncome * 200;
		return calculateMonthlyIncome;
	}

	
	public static void weeklyIncome(){												/*Static Method*/
		int calculateWeeklyIncome = hourlyIncome * 40;	
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
		
	}
}
