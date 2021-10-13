package exercise439;

public class PopulationThroughout75Years {
	
//	World population has grown considerably over the centuries.
//	Continued growth could eventually challenge the limits of breathable air, drinkable water, arable
//	cropland and other limited resources. There’s evidence that growth has been slowing in recent years
//	and that world population could peak some time this century, then start to decline.
//	For this exercise, research world population growth issues online. Be sure to investigate various
//	viewpoints. Get estimates for the current world population and its growth rate (the percentage by
//	which it’s likely to increase this year). Write a program that calculates world population growth
//	each year for the next 75 years, using the simplifying assumption that the current growth rate will stay
//	constant. Print the results in a table. The first column should display the year from year 1 to year
//	75. The second column should display the anticipated world population at the end of that year.
//	The third column should display the numerical increase in the world population that would occur
//	that year. Using your results, determine the year in which the population would be double what it
//	is today, if this year’s growth rate were to persist.

	public static void main(String[] args) {
		double population = 7.794798739;
		double growthRate = 0.11;
		calculateWorldPopulation(population, growthRate);
	}

	public static void calculateWorldPopulation(double population, double growthRate) {
		System.out.println("*********************************************************");
		System.out.println("Year \t\t" + "Population\t\t" + "Numberial Increae");
		System.out.println("*********************************************************");
		int currentYear = 2020;
		double currentPopulation = Math.floor(population * 1000) / 1000;
		while (currentYear <= 2095) {
			if (currentYear == 2020) {
				System.out.println(currentYear + "\t\t" + currentPopulation + "\t\t\t" + 0);
				System.out.println("*********************************************************");
			} else {
				double newPopulation = Math.floor((currentPopulation + currentPopulation * growthRate)*1000)/1000;
				System.out.println(currentYear + "\t\t" + newPopulation + "\t\t\t" + Math.floor((newPopulation - currentPopulation)*1000)/1000);
				System.out.println("*********************************************************");
				currentPopulation = newPopulation;
			}
			currentYear++;
		}
	}
}
