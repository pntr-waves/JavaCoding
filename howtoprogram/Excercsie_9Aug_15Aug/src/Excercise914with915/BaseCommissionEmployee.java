package Excercise914with915;

public class BaseCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	public BaseCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if(baseSalary < 0) {
			throw new IllegalArgumentException("base salary must be > 0");
		}
		this.baseSalary=baseSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0) {
			throw new IllegalArgumentException("base salary must be > 0");
		}
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earning() {
		return super.earning() + getBaseSalary();
	}
	
}
