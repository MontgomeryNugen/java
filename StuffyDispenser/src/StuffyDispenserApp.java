import java.util.Scanner;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Stuffy Dispenser!");
		System.out.println("Create a new Stuffy...");
		
		System.out.print("Enter Stuffy name: ");
		String name = input.next();
		
		System.out.print("Enter Stuffy type (Bear, Monkey, etc.): ");
		String type = input.next();
		
		System.out.print("Enter Stuffy color: ");
		String color = input.next();
		
		Stuffy myStuffy = new Stuffy(name, type, color);
		
		System.out.println("New Stuffy: " + myStuffy);	
		
		input.close();
		System.out.println("Goodbye!");
	}

}
