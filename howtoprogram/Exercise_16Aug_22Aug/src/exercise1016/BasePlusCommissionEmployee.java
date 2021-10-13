package exercise1016;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double salaries;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double salaries) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if (salaries <= 0) {
			throw new IllegalArgumentException("salaries must be > 0");
		}

		this.setSalaries(salaries);
	}

	public double getSalaries() {
		return salaries;
	}

	public void setSalaries(double salaries) {
		if (salaries <= 0) {
			throw new IllegalArgumentException("salaries must be > 0");
		}
		this.salaries = salaries;
	}

	@Override
	public double earnings() {
		return super.earnings() + getSalaries();
	}

}
