
public class PersonManagerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Person Manager\n");
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			String typeOfPerson = Console.getString("Create customer or employee? (c/e): ", "c", "e");
		
			if (typeOfPerson.equalsIgnoreCase("c")) {
				String fName = Console.getString("First name: ");
				String lName = Console.getString("Last name: ");
				String cNumber = Console.getString("Customer number: ");
				Customer cust = new Customer(fName, lName, cNumber);
				System.out.println();
				
				System.out.println("You entered a new Customer:");
				System.out.println(cust.toString());
				
			}
			
			if (typeOfPerson.equalsIgnoreCase("e")) {
				String fName = Console.getString("First name: ");
				String lName = Console.getString("Last name: ");
				String social = Console.getString("SSN: ");
				Employee emp = new Employee(fName, lName, social);
				System.out.println();
				
				System.out.println("You entered a new Employee:");
				System.out.println(emp.toString());
				
			}
			
			choice = Console.getString("Continue? (y/n) ", "y", "n");
			System.out.println();
		}
		
		System.out.println("Goodbye!");
	}

}
