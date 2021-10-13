package exercise1012;

import java.time.LocalDate;

public class SalariedEmployee extends Employees {

	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDay,
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, birthDay);
		if (weeklySalary <= 0) {
			throw new IllegalArgumentException("weekly salary must be > 0");
		}
		this.setWeeklySalary(weeklySalary);
	}

	@Override
	public double getPaymentAmount() {
		LocalDate now = LocalDate.now();
		double bonus = 0;
		if (now.getMonthValue() == super.getBirthDay().getMonth()) {
			bonus = 1000;
		}
		return getWeeklySalary() + bonus;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary <= 0) {
			throw new IllegalArgumentException("weekly salary must be > 0");
		}
		this.weeklySalary = weeklySalary;
	}

}
