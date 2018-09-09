import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("Welcome to the Change Calculator\n");
		
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.print("Enter the number of cents (0-99): ");
			int cents = input.nextInt();
			
			int quarters = cents / 25;
			int dimes = (cents % 25) / 10;
			int nickels = ((cents % 25) % 10) / 5;
			int pennies = (((cents % 25) % 10) % 5);
			
			System.out.println();
			String message =
					"Quarters: " + quarters + "\n"
				  + "Dimes:    " + dimes + "\n"
				  + "Nickels:  " + nickels + "\n"
				  + "Pennies:  " + pennies + "\n";
			System.out.println(message);
			
			System.out.print("Continue? (y/n)");
			choice = input.next();
			System.out.println();
		}
		input.close();
	}

}
