import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Letter Grade Converter!\n");
		Scanner input = new Scanner(System.in);

		String letterGrade = "";
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter numerical grade: ");
			int numericalGrade = input.nextInt();
			if (numericalGrade >= 88) {
				letterGrade = "A";
			} else if (numericalGrade >= 80) {
				letterGrade = "B";
			} else if (numericalGrade >= 67) {
				letterGrade = "C";
			} else if (numericalGrade >= 60) {
				letterGrade = "D";
			} else {
				letterGrade = "F";
			}
			System.out.println("Letter grade: " + letterGrade + "\n");
			System.out.print("Continue? (y/n): ");
			choice = input.next();
			System.out.println();
		}
		input.close();
		System.out.println("Thanks for playing!");
	}

}
