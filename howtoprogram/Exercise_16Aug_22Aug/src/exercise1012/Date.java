package exercise1012;

public class Date {
	private int day;
	private int month;
	private int year;

	private static final int[] DAY_PER_MONTH = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Date(int day, int month, int year) {
		if (month <= 0 || month > 12) {
			throw new IllegalArgumentException(month + "is not the month");
		}
		if (day <= 0 || (day > DAY_PER_MONTH[month] && !(day == 29 && month == 2))) {
			throw new IllegalArgumentException(day + "is not day per specific month");
		}

		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
			throw new IllegalArgumentException(day + "is not day per specific month");
		}

		this.day = day;
		this.month = month;
		this.year = year;

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day <= 0 || (day > DAY_PER_MONTH[this.month] && !(day == 29 && this.month == 2))) {
			throw new IllegalArgumentException(day + "is not day per specific month");
		}

		if (this.month == 2 && day == 29 && !(this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0))) {
			throw new IllegalArgumentException(day + "is not day per specific month");
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month <= 0 || month > 12) {
			throw new IllegalArgumentException(month + "is not the month");
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
