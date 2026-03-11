package com.task3;

public class Account {
	private String accountNumber;
	private String acountHolderName;
	private double balance;
	public Account(String accountNumber, String acountHolderName, double balance) {
		if(accountNumber==null || accountNumber.trim().isEmpty()) {
			throw new IllegalArgumentException("Account numberf cannot be empty");
		}
		this.accountNumber = accountNumber;
		this.acountHolderName = acountHolderName;
		this.balance = balance;
	}
	 public void deposit(double amount) throws InvalidAmountException{
		 if(amount <=0 ) {
			 throw new InvalidAmountException("Deposit amount must be grater than 0");
		 }
		 balance += amount;
		 System.out.println("Deposit Sucessful! New Balance: "+ balance);
	 }
	 
	 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException{
		 if(amount <=0 ) {
			 throw new InvalidAmountException("  withdrawal must be grater than 0");
		 }
		 if(amount > balance) {
			 throw new InsufficientFundsException(" Insufficaint balance for the withdrawal ");
		 }
		 balance -= amount;
		 System.out.println("withdrawal sucessful! Remaining Balance: "+ balance);
	 }
	 public double getBalance() {
		 return balance;
	 }
	

}
