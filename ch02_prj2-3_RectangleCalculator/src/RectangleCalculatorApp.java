import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("Welcome to the Area and Perimeter Calculator\n");
		
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter length: ");
		double length = input.nextDouble();
		System.out.print("Enter width: ");
		double width = input.nextDouble();
		
		double area = width * length;
		double perimeter = (2 * width) + (2 * length);
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println();
		
		System.out.print("Continue? (y/n): ");
		choice = input.next();
		System.out.println();
		
		
		}
		input.close();
		
	}

}
