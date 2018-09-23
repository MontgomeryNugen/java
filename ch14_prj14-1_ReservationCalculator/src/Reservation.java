import java.time.LocalDate;

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
		return null;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public String getDepartureDateFormatted() {
		return null;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public int getNumberOfNights() {
		return 0;
	}

	public String getPricePerNightFormatted() {
		return null;
	}

	public double getTotalPrice() {
		return 0;
	}

	public String getTotalPriceFormatted() {
		return null;
	}

}
