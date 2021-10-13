package exercise533;

public class App {
	
//	According to CNNMoney.com, Facebook hit one billion us-
//	ers in October 2012. Using the compound-growth technique you learned in Fig. 5.6 and assuming
//	its user base grows at a rate of 4% per month, how many months will it take for Facebook to grow
//	its user base to 1.5 billion users? How many months will it take for Facebook to grow its user base
//	to two billion users?

	public static void main(String[] args) {
		double amoutUsers = 1.0;
		double rateGrowth = 0.04;
		int month15 = 0;
		int month20 = 0;
		System.out.println("User of FB growth to 1.5 billion users in " + month15 + " month");
		System.out.println("User of FB growth to 2.0 billion users in " + month20 + " month");
		
		
		while(amoutUsers <= 2.0) {
			amoutUsers = amoutUsers + amoutUsers * rateGrowth;
			System.out.println(amoutUsers);
			if(amoutUsers <= 1.5) {
				month15++;				
			}
			month20++;
		}
		
		
		System.out.println("User of FB growth to 1.5 billion users in " + month15 + " month");
		System.out.println("User of FB growth to 2.0 billion users in " + month20 + " month");
	}

}
