import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Squares and Cubes table!");

		Scanner input = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an Integer: ");
			int number = input.nextInt();

			System.out.println("Number  Squared Cubed");
			System.out.println("======  ======= =====");

			for (int i = 1; i <= number; i++) {
				int squared = i * i;
				int cubed = i * i * i;
				System.out.println(i + "\t" + squared + "\t" + cubed);
//			System.out.print(squared + "\t");
//			System.out.println(cubed);
			}

			System.out.print("Continue? (y/n): ");
			choice = input.next();
		}

		input.close();
		System.out.println("Thanks for playing!");

	}

}
