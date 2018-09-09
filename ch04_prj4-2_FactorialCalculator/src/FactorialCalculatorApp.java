import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Factorial Calculator!\n");

		while (choice.equalsIgnoreCase("y")) {
			long factorial = 1;

			//modified to accept up to 20 (max for program)
			System.out.print("Enter an Integer that's greater than 0 and less than 21: ");
			int number = input.nextInt();
			for (int i = 1; i < number ; i++) {
				factorial = factorial * (i + 1);
			}
			
			System.out.println("The Factorial of " + number + " is " + factorial + ".");
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = input.next();
			System.out.println();
			
		}
		input.close();

	}

}
