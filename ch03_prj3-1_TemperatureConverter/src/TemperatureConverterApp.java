import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		
		String choice = "y";

		System.out.println("Welcome to the Temperature Converter\n");

		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter degrees in Fahrenheit: ");
			double tempF = input.nextDouble();
			double tempC = (tempF - 32) * 5 / 9;
			String celciusTwoDecimals = number.format(tempC);

			System.out.println("Degrees in Celsius: " + celciusTwoDecimals + "\n");

			System.out.print("Continue? (y/n): ");
			choice = input.next();
			System.out.println();

		}
		input.close();
		System.out.println("Thanks for playing!");
	}

}
