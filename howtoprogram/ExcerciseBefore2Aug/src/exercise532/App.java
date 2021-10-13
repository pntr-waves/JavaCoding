package exercise532;

import java.util.Scanner;

public class App {
	
//	There are many proposals to make taxation fairer.
//	Check out the FairTax initiative in the United States at www.fairtax.org. Research how the pro-
//	posed FairTax works. One suggestion is to eliminate income taxes and most other taxes in favor of
//	a 23% consumption tax on all products and services that you buy. Some FairTax opponents ques-
//	tion the 23% figure and say that because of the way the tax is calculated, it would be more accurate
//	to say the rate is 30%—check this carefully. Write a program that prompts the user to enter expenses
//	in various expense categories they have (e.g., housing, food, clothing, transportation, education,
//	health care, vacations), then prints the estimated FairTax that person would pay.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = asset.values().length;
		int index = 0;
		int totalExpense = 0;
		
		while(index < length) {
			System.out.println("Enter expense");
			System.out.println("Expense of " + asset.values()[index].getTitle());
			System.out.print("=> ($) ");
			totalExpense += scanner.nextInt();
			index++;
		}
		
		System.out.println("Tax income => " + totalExpense*0.3);
	}
}
