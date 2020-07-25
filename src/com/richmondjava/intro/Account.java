package com.richmondjava.intro;

import java.util.Scanner;

public class Account {

	//instance variables for Account owner and balance 
	private String accountOwner;
	private int balance;

	//constructor to initialize account
	public Account(String accountOwner, int balance) {
		this.accountOwner = accountOwner;
		this.balance = balance;
	}
	//get account owner name
	public String getAccountOwner() {
		return accountOwner;
	}
	//get balance in account
	public int getBalance() {
		return balance;
	} 

	//deposit money in account
	public int deposit(int amount) {
		balance+= amount;
		return balance;
	}
	//withdraw money from account
	public int withdraw(int amount) {
		if (amount > balance) {
			System.out.println("You cannot withdraw more than what yor balance is.");
		}else {
			balance-= amount;
		}
		return balance;
	}

	//main entry into the program
	public static void main(String[] args) {

		//int variable amount
		int amount = 0;
		int numberPressed;

		//creating an instance of Account called myAccount
		Account myAccount = new Account("David", 1450);

		//creating an instance of Scanner called scanner
		Scanner scanner = new Scanner(System.in);		
		do {
			System.out.println("Welcome! Press 1 for Balance, 2 for Deposit, "
					+ "3 for Withdraw, 4 to Exit");

			//Reading input from Scanner and assigning it to numberPressed
			numberPressed = scanner.nextInt();	

			if (numberPressed == 1) {
				System.out.println(myAccount.getAccountOwner() 
						+ " your balance is: " 
						+ myAccount.getBalance()); //return balance
			}
			else if (numberPressed == 2) {
				System.out.println("Please enter the amount to be deposited: ");
				amount = scanner.nextInt();
				System.out.println(myAccount.getAccountOwner() 
						+" your new balance after the deposit is: " 
						+ myAccount.deposit(amount));
			}
			else if (numberPressed == 3){
				System.out.println("Please enter the amount to withdraw: ");
				amount = scanner.nextInt();
				System.out.println(myAccount.getAccountOwner() 
						+" your new balance after the withdrawal is: " 
						+ myAccount.withdraw(amount));
			}
			else if (numberPressed < 1 || numberPressed > 4){
				System.out.println("Invalid input ");
			}
		} while (numberPressed != 4);
		
		System.out.println("Bye!");
		System.exit(0); 

		scanner.close();
	}
}