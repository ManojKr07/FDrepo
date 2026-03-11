package com.task3;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number");
		String accNo=sc.nextLine();
		
		System.out.println("enter the account holder name");
		String name = sc.nextLine();
		
		System.out.println("Enter the Initial Balance");
		double bal = sc.nextDouble();
		
		Account acc = new Account(accNo, name, bal);
		
		while(true) {
			System.out.println("Banking menu");
			System.out.println("1. Deposit");
			System.out.println("2. withdraw");
			System.out.println("3. check balance");
			System.out.println("4.Exit");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			
			try {
			switch (choice) {
			case 1: {
				double damt= sc.nextDouble();
				acc.deposit(damt);
				break;
			}
			case 2: {
				double wamt=sc.nextDouble();
				acc.withdraw(wamt);
				break;
			}
			case 3: {
				System.out.println("curent balance :" + acc.getBalance());
				break;
			}
			case 4: {
				System.out.println("Exiting...");
				return;
			}
			default:
				System.out.println("Invalid choice!.");
			}
		}
		catch(InvalidAmountException e) {
			System.out.println("Error:"+ e.getMessage());
		}
			catch(InsufficientFundsException e) {
				System.out.println("Error:"+ e.getMessage());
			}
			catch(Exception e) {
				System.out.println("Error:"+ e.getMessage());
			}
			finally {
				System.out.println("transation  processed");
			}
	}
	}}
