import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Guess the Number Game!");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {
			boolean correctGuess = false;
			int theNumber = generateRandomNumber();
			int counter = 0;
			while(!correctGuess) {
				int guess = getInt("Enter number", input, 1, 100);
				counter++;
				// compare guess vs the number
				String resp = "";
				if (guess > theNumber) {
					int diff = guess - theNumber;
					if (diff > 10) {
						resp = "Way too high!";
					} else {
						resp = "Too high!";
					}
				} else if (guess < theNumber) {
				int diff = theNumber - guess;
				if (diff > 10) {
					resp = "Way too low!";
				} else {
					resp = "Too low!";
				}
			} else {
				resp = "You got it in "+counter+" tries.";
				correctGuess = true;
			}
				System.out.println(resp);
			//use counter to display correct message
				
			choice = input.next();
		}

		System.out.println(generateRandomNumber());

		System.out.println();
		System.out.println("Thanks for playing!");
		input.close();
	}
	}
	// generate a random # between 1 and 100
	private static int generateRandomNumber() {
		System.out.println("I'm thinking of a number between 1 and 100.");
		System.out.println("Try to guess it!");
		System.out.println();
		return (int) ((Math.random() * 100) + 1);
	}

	private static int getInt(String prompt, Scanner scan) {
		System.out.println(prompt);
		int n = 0;
		boolean isValid = false;
		while (!isValid) {
			if (scan.hasNextInt()) {
				isValid = true;
				n = scan.nextInt();
			} else {
				System.out.println("Please enter a valid integer.");
			}
		}
		return n;
	}

	private static int getInt(String prompt, Scanner scan, int min, int max) {
		boolean isValid = false;
		int n = 0;
		while (!isValid) {
			n = getInt(prompt, scan);
			if (n < min) {
				System.out.println("Number below minimum (" + min + ").");
			} else if (n > max) {
				System.out.println("Number above maximum (" + max + ").");
			} else {
				isValid = true;
			}
		}
		return n;
	}
}
