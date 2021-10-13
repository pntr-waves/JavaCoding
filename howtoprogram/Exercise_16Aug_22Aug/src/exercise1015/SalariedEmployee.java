package exercise1015;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		if (weeklySalary <= 0) {
			throw new IllegalArgumentException("weekly salary must be > 0");
		}
		this.setWeeklySalary(weeklySalary);
	}

	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
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
