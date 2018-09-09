import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        
		Scanner sc = new Scanner(System.in);
        NumberFormat newMpg = NumberFormat.getNumberInstance();
        newMpg.setMaximumFractionDigits(2);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            String milesString = sc.next();
            BigDecimal miles = new BigDecimal(milesString);
            
            System.out.print("Enter gallons of gas used: ");
            String gallonsString = sc.next();
            BigDecimal gallons = new BigDecimal(gallonsString);
            
//            double mpg = (double) Math.round((miles/gallons) * 100) / 100;
//            double mpg = (miles / gallons);
//            String xMpg = newMpg.format(mpg);
            
            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_EVEN);
           
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
            
            sc.close();
        }
    }
    
}
