package exercise1015;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		if (grossSales < 0) {
			throw new IllegalArgumentException("gross sales must be >= 0");
		}
		if (commissionRate <= 0 || commissionRate >= 1) {
			throw new IllegalArgumentException("commission rate must be > 0 and < 1");
		}

		this.setGrossSales(grossSales);
		this.setCommissionRate(commissionRate);
	}

	@Override
	public double getPaymentAmount() {
		return getGrossSales() * getCommissionRate();
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales < 0) {
			throw new IllegalArgumentException("gross sales must be >= 0");
		}
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0 || commissionRate >= 1) {
			throw new IllegalArgumentException("commission rate must be > 0 and < 1");
		}
		this.commissionRate = commissionRate;
	}

}
