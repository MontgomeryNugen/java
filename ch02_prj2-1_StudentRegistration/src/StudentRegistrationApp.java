import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Student Registration Form\n");
		
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter year of birth: ");
		int yearBirth = input.nextInt();
		System.out.println();
		
		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstName + "*" + yearBirth);
		
		input.close();
		
	}

}
