import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private static final double PRICE_PER_NIGHT = 145.00;

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String getArrivalDateFormatted = dtf.format(getArrivalDate());
		return getArrivalDateFormatted;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String getDepartureDateFormatted = dtf.format(getDepartureDate());
		return getDepartureDateFormatted;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public int getNumberOfNights() {
		int numDays = (int) ChronoUnit.DAYS.between(getArrivalDate(), getDepartureDate());
		return numDays;
	}

	public String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceNightFormattedString = currency.format(PRICE_PER_NIGHT);
		return priceNightFormattedString;
	}

	public double getTotalPrice() {
		double totalPrice = PRICE_PER_NIGHT * getNumberOfNights();
		return totalPrice;
	}

	public String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceTotalFormattedString = currency.format(getTotalPrice());
		return priceTotalFormattedString;
	}

}
