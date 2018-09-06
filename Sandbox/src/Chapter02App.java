import java.util.Scanner;

public class Chapter02App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hello!!!\n");
		
		System.out.print("Enter an Integer: ");
		double a = input.nextInt();
		
		System.out.print("Enter another Integer: ");
		double b = input.nextInt();
		
		System.out.print("Enter another Integer: ");
		double c = input.nextInt();
		System.out.println();
		
		double average = (a + b + c) / 3;
		System.out.println("The Average is: " + average + "\n");
		
		// If average > 90 say A student, if not say not Harvard material
		if (average > 90) {
			System.out.println("\"A\" Student!!!");
		} else {
			System.out.println("NOT Harvard material!!!");
		}
		
		System.out.println("Enter 'yes' or 'no': ");
		String str = input.next();
		if (str.equalsIgnoreCase("yes"));
			System.out.println("User entered 'yes'.");
		System.out.println("Goodbye!");
		input.close();
	}

}
