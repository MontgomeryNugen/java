import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Dice Roller!\n");
		System.out.print("Roll the dice? (y/n): ");
		String choice = input.next();
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {
			// new instance will automatically the dice
			Dice d = new Dice();
			System.out.println(d);

			System.out.print("Roll again? (y/n): ");
			choice = input.next();
			System.out.println();
		}
		System.out.println("Goodbye!");
		input.close();
	}

}
