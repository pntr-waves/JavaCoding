package truong.fibonaci.service;

public class FibonaciService {
	public static void getFibonaciWithoutRecursive() {
		int n1 = 0; 
		int n2 = 1;
		for (int  i = 0; i < 100; i++) {
			if (i == 0) {
				System.out.print(String.format(" %d ", n1));
			} else if (i == 1) {
				System.out.print(String.format(" %d ", n2));
			} else {
				int n3 = n2 + n1;
				System.out.print(String.format(" %d ", n3));
				n1 = n2;
				n2 = n3;
			}
		}
	}
	
	public static void getFibonaciWithRecursive(int startNumber, int n1, int n2) {
		if (startNumber == 100) {
			return;
		}
		
		if (startNumber == 0) {
			System.out.print(String.format(" %d ", 0));
		} else if (startNumber == 1) {
			System.out.print(String.format(" %d ", 1));
			n1 = 0;
			n2 = 1;
		} else {
			int n3 = n1 + n2;
			System.out.print(String.format(" %d ", n3));
			n1 = n2;
			n2 = n3;
		}
		
		getFibonaciWithRecursive(startNumber + 1, n1, n2);
	}
	
}
