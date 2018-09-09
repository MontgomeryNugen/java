import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Travel Time Calculator\n");

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			double milesDriven = input.nextDouble();

			System.out.print("Enter miles per hour: ");
			double milesPerHour = input.nextDouble();
			double milesPerMinute = (int) milesPerHour / 60;

			int hours = (int) (milesDriven / milesPerMinute) / 60;
			int minutes = (int) ((milesDriven % milesPerHour) / milesPerMinute);

			System.out.println("Estimated Travel Time");
			System.out.println("---------------------");
			System.out.println("Hours:\t" + hours);
			System.out.println("Minutes:\t" + minutes);
			System.out.println();

			System.out.println("Continue? (y/n): ");
			choice = input.next();
			System.out.println();

		}
		input.close();
		System.out.println("Have a great day!");
	}

}
