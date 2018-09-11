import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the Letter Grade Converter!\n");

		while (choice.equalsIgnoreCase("y")) {

			int grade = Console.getInt("Enter numerical grade: ", 0, 100);
			Grade g = new Grade(grade);

			System.out.println("Letter Grade: " + g.getLetter());
			System.out.println();

			choice = Console.getString("Continue? (y/n) ", "y", "n");
			System.out.println();
		}
		System.out.println("Goodbye!");
		input.close();
	}

}
