import java.time.LocalDate;

public class ReservationCalculatorApp {

	public static void main(String[] args) {

		System.out.println("Reservation Calculator\n");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			int aMonth = Console.getInt("Enter the arrival month (1-12): ", 1, 12);
			int aDay = Console.getInt("Enter the arrival day (1-30): ", 1, 31);
			int aYear = Console.getInt("Enter the arrival year: ");
			System.out.println();

			int dMonth = Console.getInt("Enter the departure month (1-12): ", 1, 12);
			int dDay = Console.getInt("Enter the departure day (1-30): ", 1, 31);
			int dYear = Console.getInt("Enter the departure year: ");
			System.out.println();

			LocalDate arrivalDate = LocalDate.of(aYear, aMonth, aDay);
			LocalDate departureDate = LocalDate.of(dYear, dMonth, dDay);

			Reservation resv = new Reservation(arrivalDate, departureDate);

			System.out.println("Arrival Date: " + resv.getArrivalDateFormatted());
			System.out.println("Departure Date: " + resv.getDepartureDateFormatted());
			System.out.println("Price: " + resv.getPricePerNightFormatted() + " per night");
			System.out.println(
					"Total Price: " + resv.getTotalPriceFormatted() + " for " + resv.getNumberOfNights() + " nights");
			System.out.println();

			choice = Console.getString("Continue? (y/n) ", "y", "n");
			System.out.println();
		}

		System.out.println("Bye!");
	}

}
