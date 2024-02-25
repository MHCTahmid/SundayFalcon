package com.upskill.assignment_3;

import java.util.Scanner;

/*Write a class name BankAccount which has savings and checking class. 
BankAccount class that has a name and an initial amount, which are both set in the constructor. 
Also, it lets users make deposits. Note that the account name must be set when an account is created. 
Demonstrates the account class hierarchy with output of:


	a.    account name: savings
	b.    initial amount: 10000
	c.    new amount after deposit: 15000
	d.    account name: checking
	e.    initial amount: 20000
	f.    new amount after deposit: 26000
	g.    new amount after withdrawal: 23000*/


public class Assignment_3_1_BankAccount {
	
	public Assignment_3_1_BankAccount(String accname){
	}
	
	
	public static void main(String[] args) {
		Saving s = new Saving("Saving");
		s.deposit(5000);
		Checking c = new Checking("Checking");
		c.deposit(6000);
		c.withdraw(3000);
	}

}
