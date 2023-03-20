package sort;

import data.ArrayTester;
import service.Service;

public class InterchangeApp {
	public static void main(String[] args) {
		int[] numberArray = interchangeSort();
		Service.printArray(numberArray);
	}
	
	public static int[] interchangeSort() {
		int[] numberArray = ArrayTester.getListNumber();
		for (int i = 0; i < numberArray.length; i++) {
			for (int j = i + 1; j < numberArray.length; j++) {
				if (numberArray[i] > numberArray[j]) {
					int temp = numberArray[j];
					numberArray[j] = numberArray[i];
					numberArray[i] = temp;
				}
			}
		}
		
		return numberArray;
	}
}
