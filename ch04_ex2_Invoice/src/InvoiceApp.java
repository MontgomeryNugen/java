import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Invoice App!");

		while (!choice.equalsIgnoreCase("n")) {
			// get the input from the user
			System.out.print("Enter customer type (r/c/t): ");
			String customerType = sc.next();
			System.out.print("Enter subtotal:   ");
			double subtotal = sc.nextDouble();

//			// get the discount percent
//			double discountPercent = 0.0;
//			switch (customerType) {
//			case "r":
//			case "R":
//				if (subtotal < 100) {
//					discountPercent = 0.0;
//				} else if (subtotal >= 250 && subtotal < 500) {
//					discountPercent = .25;
//				} else if (subtotal >= 500) {
//					discountPercent = .3;
//				}
//				break;
//			case "c":
//			case "C":
//				discountPercent = .2;
//				break;
//			case "t":
//			case "T":
//				if (subtotal < 500) {
//					discountPercent = 0.4;
//				} else if (subtotal >= 500) {
//					discountPercent = .5;
//				}
//				break;
//			default:
//				discountPercent = 0;
//				break;
//			}

			// get the discount percent
			double discountPercent = 0.0;
			if (customerType.equalsIgnoreCase("r")) {
				if (subtotal < 100) {
					discountPercent = 0.0;
				} else if (subtotal >= 250 && subtotal < 500) {
					discountPercent = .25;
				} else if (subtotal >= 500) {
					discountPercent = .3;
				} else {
					discountPercent = 0.0;
				}
			}
			if (customerType.equalsIgnoreCase("c")) {
				discountPercent = 0.2;
			}
			if (customerType.equalsIgnoreCase("t")) {
				if (subtotal < 500) {
					discountPercent = 0.4;
				} else if (subtotal >= 500) {
					discountPercent = .5;
				}

			}

			// calculate the discount amount and round to 2 decimals
			double discountAmount = subtotal * discountPercent;
			discountAmount = Math.ceil(discountAmount * 100) / 100;

			// calculate the total
			double total = subtotal - discountAmount;

			// format and display the results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			System.out.println("Discount percent: " + percent.format(discountPercent) + "\n" + "Discount amount:  "
					+ currency.format(discountAmount) + "\n" + "Total:            " + currency.format(total) + "\n");

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Thanks for playing!");
		sc.close();
	}

}
