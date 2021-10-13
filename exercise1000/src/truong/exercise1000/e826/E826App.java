package truong.exercise1000.e826;

import java.util.List;

import truong.exercise1000.e826.Data.E826DataTestBuilder;
import truong.exercise1000.e826.model.MilkBottle;
import truong.exercise1000.e826.service.E826Service;

public class E826App {
	public static void main(String[] args) {
		E826Service service  = new E826Service();
		List<MilkBottle> listMilkBottle = E826DataTestBuilder.getListMilkBottle();
		final int YEAR_COMPARE = 2021;
		System.out.println("How many milk bottle has manufacture before 2021?");
		System.out.println("===================================================");
		System.out.println(service.countMilkBottleHasManufactureTimeBeforeAYear(listMilkBottle, YEAR_COMPARE));
		System.out.println("\nMilk Bottle is the newest");
		System.out.println("===================================================");
		service.printItem(service.findTheNewestBottle(listMilkBottle));
		System.out.println("\nsort milk bottle by expiration time");
		System.out.println("===================================================");
		service.printList(service.sortListAscendingByExpirationTime(listMilkBottle));
	}
}
