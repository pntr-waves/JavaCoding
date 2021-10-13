package Excercise85;

public class App {
	
	/*
	 * It would be perfectly reasonable
for the Time2 class of Fig. 8.5 to represent the time internally as the number of seconds since mid-
night rather than the three integer values hour, minute and second. Clients could use the same pub-
lic methods and get the same results. Modify the Time2 class of Fig. 8.5 to implement the time as
the number of seconds since midnight and show that no change is visible to the clients of the class.
	 * */
	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000);
		SavingAccount saver2 = new SavingAccount(3000);
		
		System.out.println("With annual interest rate: 4%");
		SavingAccount.modifyInterestRate(0.04);
		System.out.println("saver1's saving balance after 12 month " + saver1.getSavingBalance() + " ->" + saver1.calculateMontlyInterest());
		System.out.println("saver1's saving balance after 12 month " + saver2.getSavingBalance() + " ->" + saver2.calculateMontlyInterest());
		System.out.println("With annual interest rate: 5%");
		SavingAccount.modifyInterestRate(0.05);
		System.out.println("saver1's saving balance after 12 month " + saver1.getSavingBalance() + " ->" + saver1.calculateMontlyInterest());
		System.out.println("saver1's saving balance after 12 month " + saver2.getSavingBalance() + " ->" + saver2.calculateMontlyInterest());
	}
}
