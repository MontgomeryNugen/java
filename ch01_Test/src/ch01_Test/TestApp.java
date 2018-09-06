package ch01_Test;


import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
				
//		double q = 10;
//		double price = 49.50;
//		double t = (price * q);
//		
//		System.out.printf("%.2f", t);
//		System.out.println();
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Welcome to my program!");
//		System.out.println("Enter you name: ");
//		String name = input.next();
//		System.out.println("Good Morning, " + name + ".\n");
//		System.out.print("Enter a number between 1 and 10: ");
//		double number = input.nextDouble();
//		System.out.println("Your lucky number is: " + (int) (number * 5) / 2);
//		System.out.println();
//		Date now = new Date();
//		String currentDate = now.toString();
//		System.out.println("The current Date & Time are: " + currentDate);
//		System.out.println();
//		System.out.println("Goodbye, " + name +"!");		
		
//		input.close();
		int i = 1;
		int sum = 0;
		while (i < 5) {
			sum = sum + i;
			i = i + 1;
			System.out.println("i: " + i + "\tsum: " + sum);
			//System.out.println(i);
		}
		
		double majority = .5051;
		NumberFormat percent = NumberFormat.getPercentInstance();
		String majorityString = percent.format(majority);
		System.out.println(majorityString);
	}

}
