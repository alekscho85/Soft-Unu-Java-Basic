import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class P7_DaysBetweenTwoDates {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String startInput = input.nextLine();
		if (startInput.length() == 9) {
			startInput = "0" + startInput;
		}
		
		String endInput = input.nextLine();
		if (endInput.length() == 9) {
			endInput = "0" + endInput;
		}
		
		LocalDate start = LocalDate.parse(startInput, formatter);
		LocalDate end = LocalDate.parse(endInput, formatter);
		
		long daysBetween = ChronoUnit.DAYS.between(start, end);
		
		System.out.println(daysBetween);
	}

}
