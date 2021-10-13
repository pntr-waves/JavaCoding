package exercise316;

import java.util.Calendar;


public class HeartRate {
	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private int year;

	public HeartRate(String firstName, String lastName, int day, int month, int year) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		return year - this.year;
	}

	public int getMaximumHeartRate() {
		return 220 - this.getAge();
	}

	public int[] getTargetHeartRateRange() {
		int[] range = { (int) (0.5 * this.getMaximumHeartRate()), (int) (0.85 * this.getMaximumHeartRate()) };
		return range;
	}
}
