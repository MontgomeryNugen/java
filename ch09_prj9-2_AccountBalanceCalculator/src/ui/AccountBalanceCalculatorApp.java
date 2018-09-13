package ui;
import java.text.NumberFormat;

import business.*;
import util.Console;

public class AccountBalanceCalculatorApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Account Balance Calculator!\n");
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Starting Balance");
		CheckingAccount ca = new CheckingAccount(1000);
		SavingsAccount sa = new SavingsAccount(1000);

		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));
		System.out.println();

		System.out.println("Enter the transactions for the month:\n");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String transType = Console.getString("Withdrawal or Deposit? (w/d): ", "w", "d");
			String acctType = Console.getString("Checking or Savings? (c/s): ", "c", "s");
			double amount = Console.getDouble("Amount?: ", 0, Double.POSITIVE_INFINITY);
			System.out.println();
			
			Account acct = null;
			if (acctType.equalsIgnoreCase("c"))
				acct = ca;
			else if (acctType.equalsIgnoreCase("s"))
				acct = sa;

			if (transType.equalsIgnoreCase("w"))
				acct.withdraw(amount);
			else if (transType.equalsIgnoreCase("d"))
				acct.deposit(amount);

			choice = Console.getString("Continue? (y/n): ", "y", "n");
			System.out.println();
		}
		
		sa.applyInterestPayment();
		ca.deductMonthlyFee();
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking Fee: " + cf.format(ca.getMonthlyFee()));
		System.out.println("Saving interest payment: " + cf.format(sa.getMonthlyInterestPayment()));
		System.out.println();
		
		System.out.println("Final Balances");
		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));

		System.out.println("Goodbye!");
	}

}
