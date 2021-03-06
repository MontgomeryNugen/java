package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.User;
import com.prs.business.UserDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		System.out.println("Welcome to the JPA Demo!\n");
		
		String command = "";
		while (!command.equals("9")) {
			displayMenu();
			command = Console.getString("Enter Command: ");
			if (command.equals("1")) {
				//list users
				List<User> users = UserDB.list();
				System.out.println("List of Users:");
				for (User u : users) {
					System.out.println(u);
				}
				System.out.println();
			} else if (!command.equals("9")) {
				System.out.println("Invalid Command. Try again.");
		
				System.out.println();
			}
		
		}
		System.out.println();
		System.out.println("Goodbye!");
	}
	
	private static void displayMenu() {
		StringBuilder sb = new StringBuilder("Command Menu: \n");
		sb.append("1 - List Users:\n");
		sb.append("9 - Exit:\n");
		System.out.println(sb);
	}
}
