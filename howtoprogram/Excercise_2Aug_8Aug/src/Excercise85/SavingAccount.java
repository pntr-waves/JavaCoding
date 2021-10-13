package Excercise85;

public class SavingAccount {
	private static double annualInterestRate = 0.5;
	
	private double savingBalance;
	
	public double getSavingBalance() {
		return this.savingBalance;
	}
	
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public SavingAccount(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	public double calculateMontlyInterest() {
		return this.savingBalance*annualInterestRate;
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
}
