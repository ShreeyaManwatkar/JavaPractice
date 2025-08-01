package com.shree;

abstract class BankAccount{
	abstract void calculateInterest();
	
	public void showBalance() {
		System.out.println("Showing Balance");
	}
}

class SavingAccount extends BankAccount{
	public void calculateInterest() {
		System.out.println("Interest is 4%");
	}
}

class FixedDepositAccount extends BankAccount{
	void calculateInterest() {
		System.out.println("Interest is 5%");
	}
}

public class AbstractionTask1 {

	public static void main(String[] args) {
		
		BankAccount acc1 = new SavingAccount();
		BankAccount acc2 = new FixedDepositAccount();
		
		acc1.showBalance();
		acc1.calculateInterest();
		
		acc2.showBalance();
		acc2.calculateInterest();
		
	}
}
