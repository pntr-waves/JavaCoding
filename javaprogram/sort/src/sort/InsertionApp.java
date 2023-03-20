package sort;

import data.ArrayTester;
import service.Service;

public class InsertionApp {
	public static void main(String[] args) {
		int[] numberArray = ArrayTester.getListNumber();
		
		int[] resultArray = insertionSort(numberArray);
		
		Service.printArray(resultArray);
	}
	
	public static int[] insertionSort(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			int max = numberArray[i];
			int j = i;
			for (; j > 0 && numberArray[j - 1] > max; j --) {
				numberArray[j] = numberArray[j - 1];
			}
			numberArray[j] = max;
		}
		
		return numberArray;
	}
}
