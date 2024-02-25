package com.upskill.assignment_3;

import java.util.Scanner;

public class Checking extends Assignment_3_1_BankAccount  {
	
	public int b;
	public int newamountbefore;
	public int newamountafter;
	
	public Checking(String accname) {
		super(accname);
		System.out.println("Account Name: " + accname);
		System.out.print("Enter the initial amount: ");
		Scanner s = new Scanner(System.in);
		b = s.nextInt();
		System.out.println("Initial Amount: " + b);
	
	}
	
	public void deposit(int d){
		newamountbefore = b + d;
		System.out.println("New amount after deposit: " + newamountbefore);
	}
	
	public void withdraw(int w){
		newamountafter = newamountbefore - w;
		System.out.println("New amount after withdrawal: " + newamountafter);
	}

	public static void main(String[] args) {
		

	}

}
