import java.util.Scanner;

public class ch04ConsoleMethodsApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the ConsoleMethodsApp!");

		int a = promptForInt("Enter # a: ", input);
		int b = promptForInt("Enter # b: ", input);
		int c = promptForInt("Enter # c: ", input);

		System.out.println(a + b + c);

		input.close();
		System.out.println("Thanks for playing!");
	}

	private static int promptForInt(String prompt, Scanner input) {
		System.out.println(prompt);
		int n = input.nextInt();
		return n;
	}

}
