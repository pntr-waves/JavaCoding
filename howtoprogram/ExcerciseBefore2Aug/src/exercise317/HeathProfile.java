package exercise317;

import java.util.Calendar;

public class HeathProfile {
	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private int year;
	private double height;
	private double weight;
	
	public HeathProfile(String firstName, String lastName, int day, int month, int year, double height, double weight) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
		this.setHeight(height);
		this.setWeight(weight);
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
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

	public double getBMI() {
		double w = this.weight * 0.453592;
		double h = this.height * 0.0254;
		return w / (h * h);
	}

}
