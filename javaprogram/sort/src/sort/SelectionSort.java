package sort;

import data.ArrayTester;
import service.Service;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numberArray = ArrayTester.getListNumber();
		int[] result = selectionSort(numberArray);
		Service.printArray(result);
	}
	
	public static int[] selectionSort(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			int min = i;
			for (int j = i; j < numberArray.length; j++) {
				if (numberArray[min] > numberArray[j]) {
					min = j;
				}
			}
			
			if (min != i) {
				int temp = numberArray[i];
				numberArray[i] = numberArray[min];
				numberArray[min] = temp;
			}
		}
		
		return numberArray;
	}
}
