package sort;

import data.ArrayTester;
import service.Service;

public class BubleSortApp {
	public static void main(String[] args) {
		int[] numberArray = ArrayTester.getListNumber();
		int[] resultArray = bubleSort(numberArray);
		Service.printArray(resultArray);
	}

	public static int[] bubleSort(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			for (int j = 0; j < numberArray.length - 1 - i; j++) {
				if (numberArray[j] > numberArray[j+1]) {
					int temp = numberArray[j];
					numberArray[j] = numberArray[j+1];
					numberArray[j+1] = temp;
				}
			}
		}
		
		return numberArray;
	}
}
