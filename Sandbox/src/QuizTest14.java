import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class QuizTest14 {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1976, Month.JANUARY, 1);
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dtf.format(date));
		
		
		LocalTime now = LocalTime.now();
		LocalTime startTime = LocalTime.of(15, 30);
		if (now.compareTo(startTime) < 0) {
			System.out.println("early");
		} else if (now.compareTo(startTime) > 0) {
			System.out.println("late");
		} else if (now.compareTo(startTime) == 0) {
			System.out.println("on time");
		}
		
	}


}
