package truong.howtoprogram.chapter16.e1617.service;

import java.util.LinkedList;
import java.util.Random;

public class E1617Service {
	public LinkedList<Integer> getListNumber() {
		LinkedList<Integer> listNumber = new LinkedList<>();
		Random random = new Random();
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);
		listNumber.add(random.nextInt(100) + 1);

		return listNumber;
	}

	public int getTotalNumber(LinkedList<Integer> listNumber) {
		int sum = 0;
		for (int value : listNumber) {
			sum += value;
		}
		return sum;
	}

	public double getAverageOfListNumber(LinkedList<Integer> listNumber) {
		double average = 0;
		double sum = (double) this.getTotalNumber(listNumber);

		average = sum / (listNumber.size());
		return average;
	}

	public void printListNumber(LinkedList<Integer> listNumber) {
		int count = 0;
		for (int value : listNumber) {
			count++;
			System.out.println(String.format("%d - %d", count, value));
		}
	}

}
