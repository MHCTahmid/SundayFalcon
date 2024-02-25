package com.upskill.assignment_3;

/*Write a java program which will display 5 employee information(name, age, salary and address).
*/
public class Assignment_3_2 {
	
	public static int count = 1;
	
	Assignment_3_2(String name, int age, int salary, String address){
		System.out.println("Employee Number: "+ count);
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee Age: "+ age);
		System.out.println("Employee Salary: "+ salary);
		System.out.println("Employee Address: "+ address + "\n");
		count++;
	}
	
	
	public static void main(String[] args) {
		Assignment_3_2[] obj = new Assignment_3_2[4];
		obj[0] = new Assignment_3_2("x", 30, 18000, "NY");
		obj[1] = new Assignment_3_2("y", 31, 28000, "NJ");
		obj[2] = new Assignment_3_2("z", 32, 10000, "CT");
		obj[3] = new Assignment_3_2("a", 25, 38000, "TX");
		obj[4] = new Assignment_3_2("b", 36, 30000, "PA");
		
	}

}
