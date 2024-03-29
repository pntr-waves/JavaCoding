package exercise317;


public class MainApp {
	
//	A health-care issue that has been in the news lately is
//	the computerization of health records. This possibility is being approached cautiously because of
//	sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
//	Computerizing health records could make it easier for patients to share their health profiles and his-
//	tories among their various health-care professionals. This could improve the quality of health care,
//	help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
//	save lives. In this exercise, you�ll design a �starter� HealthProfile class for a person. The class attri-
//	butes should include the person�s first name, last name, gender, date of birth (consisting of separate attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
//	should have a constructor that receives this data. For each attribute, provide set and get methods.
//	The class also should include methods that calculate and return the user�s age in years, maximum
//	heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
//	Exercise 2.33). Write a Java app that prompts for the person�s information, instantiates an object of
//	class HealthProfile for that person and prints the information from that object�including the per-
//	son�s first name, last name, gender, date of birth, height and weight�then calculates and prints the
//	person�s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
//	the BMI values chart from Exercise 2.33.

	public static void main(String[] args) {
		HeathProfile heathProfile = new HeathProfile("John", "Adam", 20, 3, 1988, 130, 50);
		printheathProfile(heathProfile);
	}

	private static void printheathProfile(HeathProfile heathProfile) {
		System.out.println("\t\t" + heathProfile.getLastName() + " " + heathProfile.getFirstName());
		System.out.println("======================================");
		System.out.println("\t\tAge: " + heathProfile.getAge());
		System.out
				.println("\tBirthday: " + heathProfile.getDay() + "/" + heathProfile.getMonth() + "/" + heathProfile.getYear());
		System.out.println("======================================");
		System.out.println("Maximum heart rate: " + heathProfile.getMaximumHeartRate());
		int[] range = heathProfile.getTargetHeartRateRange();
		System.out.println("Target heart rate: [" + range[0] + "," + range[1] + "]");
		System.out.println("======================================");
		System.out.println("BMI: "+ Math.floor(heathProfile.getBMI()*1000)/1000);
	}
}
