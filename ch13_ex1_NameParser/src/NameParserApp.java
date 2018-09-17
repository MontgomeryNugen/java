

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        name = name.trim();
        System.out.println();
        
        int index = name.indexOf(" ");
        int index2 = name.indexOf(" ", index + 1);
        int index3 = name.indexOf(" ", index2 + 1);
        
        String firstName = name.substring(0, index);
        String middleName = name.substring(index, index2);
        String lastName = name.substring(index2);
        
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        
    }
}
