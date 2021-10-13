package Exercise814;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datee {
	private LocalDate date;

	public Datee(int day, int month, int year) {
		this.date = LocalDate.of(year, month, day);
	}

	public Datee(String month, int day, int year) {
		Month m = Month.valueOf(month);
		this.date = LocalDate.of(year, m, day);
	}

	public Datee(int daysOfYear, int year) {
		Year y = Year.of(year);
		this.date = y.atDay(daysOfYear);
	}

	public void getDateToString() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		System.out.println(this.date.format(dateTimeFormatter));
		dateTimeFormatter = DateTimeFormatter.ofPattern("LLL dd, yyyy");
		System.out.println(this.date.format(dateTimeFormatter));
		dateTimeFormatter = DateTimeFormatter.ofPattern("DDD YYY");
		System.out.println(this.date.format(dateTimeFormatter));
	}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
