package Excercise914with915;

public class CommissionEmployee extends Employees {
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);

		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be > 0");
		}
		if (commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("commission rate must be > 0  and < 1");
		}
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales < 0) {
			throw new IllegalArgumentException("Gross sales must be > 0");
		}
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0 || commissionRate >= 1) {
			throw new IllegalArgumentException("Commission Rate must be > 0 and < 1");
		}
		this.commissionRate = commissionRate;
	}
	
	public double earning() {
		return commissionRate * grossSales;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
