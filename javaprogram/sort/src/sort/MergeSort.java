package sort;

import data.ArrayTester;
import service.Service;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = ArrayTester.getListNumber();
		mergeSort(array, 0, array.length - 1);
		
		Service.printArray(array);
	}
	
	private static void merge(int[] array, int left, int mid, int right) {
		
		int leftL = mid - left + 1;
		int rightL = right - mid;
		
		int[] leftArray = new int[leftL];
		int[] rightArray = new int[rightL];
		
		for (int i = 0; i < leftL;  i++) {
			leftArray[i] = array[left + i];
		}
		
		for (int i = 0; i < (rightL); i++) {
			rightArray[i] = array[mid + 1 + i];
		}
		
		int i = 0, j = 0, k = left;
		
		while (i < leftL && j < rightL) {
			if (leftArray[i] < rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			
			k++;
		}
		
		while (i < leftL) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		while (j < rightL) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
	
	private static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			
			merge(array, left, mid, right);
		}
	}
}
