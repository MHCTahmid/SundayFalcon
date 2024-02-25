package com.upskill.assignment_3;

import java.util.Scanner;

public class Saving extends Assignment_3_1_BankAccount {

	static int newamount;
	public int a;
	
	public Saving(String accname) {
		super(accname);
		System.out.println("Account Name: " + accname);
		System.out.print("Enter the initial amount: ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		System.out.println("Initial Amount: " + a);
		
	}

	public void deposit(int d){
		newamount = a + d;
		System.out.println("New amount after deposit: " + newamount);
	}
	
	public static void main(String[] args) {
		

	}

}
