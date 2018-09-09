import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Interest Calculator\n");

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter loan amount: ");
			String loanAmountString = input.next();
			BigDecimal loanAmount = new BigDecimal(loanAmountString);
			System.out.print("Enter interest rate: ");
			String interestRateString = input.next();
			BigDecimal interestRate = new BigDecimal(interestRateString);
			
			//calculate interest owed using BigDecimal
			BigDecimal interestOwed = loanAmount.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);
			System.out.println();
			
			// format the entered data
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String amount = currency.format(loanAmount);
			String owed = currency.format(interestOwed );
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			String rate = percent.format(interestRate);
			
			//print out results
			String message =
				"Loan Amount:   " + amount + "\n"
			  + "Interest Rate: " + rate + "\n"
			  + "Interest:      " + owed + "\n";
			System.out.println(message);
						
			System.out.print("Continue? (y/n): ");
			choice = input.next();
			System.out.println();

		}
		input.close();
		System.out.println("Thank you, have a great day!");
	}

}
