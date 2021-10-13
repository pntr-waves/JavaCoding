package exercise1114;

import java.util.Random;

public class App {
	public static void main(String[] args) {
		int[] listResult = new int[100];
		int index = 0;
		Random random = new Random();
		while(index < listResult.length) {
			try {
				int a = random.nextInt(30);
				int b = random.nextInt(30);
				listResult[index] = divide(a, b);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
