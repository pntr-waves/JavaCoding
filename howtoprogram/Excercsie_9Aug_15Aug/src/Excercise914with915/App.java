package Excercise914with915;

public class App {
	public static void main(String[] args) {
		try {
			CommissionEmployee c1 = new BaseCommissionEmployee("a", "aaa", "01366", 1000, 0.3, 3000);
			System.out.println(c1.earning());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
