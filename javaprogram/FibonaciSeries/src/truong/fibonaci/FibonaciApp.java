package truong.fibonaci;

import truong.fibonaci.service.FibonaciService;

public class FibonaciApp {
	public static void main(String[] args) {
		System.out.println("Fibonaci without recursive");
		FibonaciService.getFibonaciWithoutRecursive();
		System.out.println("Fibonaci with recursive");
		FibonaciService.getFibonaciWithRecursive(0, 0, 0);
	}
}
