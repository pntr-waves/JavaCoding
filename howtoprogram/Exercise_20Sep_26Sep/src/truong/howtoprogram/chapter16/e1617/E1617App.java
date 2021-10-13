package truong.howtoprogram.chapter16.e1617;

import java.util.Comparator;
import java.util.LinkedList;

import truong.howtoprogram.chapter16.e1617.service.E1617Service;

public class E1617App {
	public static void main(String[] args) {
		E1617Service service = new E1617Service();
		LinkedList<Integer> listNumber = service.getListNumber();
		listNumber.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		service.printListNumber(listNumber);
		System.out.print("Sum: ");
		System.out.println(service.getTotalNumber(listNumber));
		System.out.print("\nAverage: ");
		System.out.println(service.getAverageOfListNumber(listNumber));
	}
}
