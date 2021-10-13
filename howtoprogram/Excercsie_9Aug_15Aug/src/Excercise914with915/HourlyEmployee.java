package Excercise914with915;

public class HourlyEmployee extends Employees {
	private double hour;
	private double wage;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hour, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		if (hour < 0) {
			throw new IllegalArgumentException("hour must be > 0");
		}

		if (wage < 0) {
			throw new IllegalArgumentException("wage must be > 0");
		}

		this.setHour(hour);
		this.setWage(wage);
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		if (hour < 0) {
			throw new IllegalArgumentException("hour must be > 0");
		}
		this.hour = hour;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0) {
			throw new IllegalArgumentException("wage must be > 0");
		}
		this.wage = wage;
	}

	public double earning() {
		return getWage() * getHour();
	}
	
	@Override
	public String toString() {
		return super.toString() + "has earning: " + earning();
	}
}
