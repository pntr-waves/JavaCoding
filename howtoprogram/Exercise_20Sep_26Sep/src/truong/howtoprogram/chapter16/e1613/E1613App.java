package truong.howtoprogram.chapter16.e1613;

import java.util.List;
import java.util.Scanner;

import truong.howtoprogram.chapter16.e1613.service.E1613Service;

public class E1613App {
	public static void main(String[] args) {
		E1613Service service = new E1613Service();
		
		List<String> listFirstName = service.getListFirstName();
		service.printFirstNameNoDuplicate(listFirstName);
		
		Scanner sc = new Scanner(System.in);
		String firstName;
		System.out.println("Enter your first name");
		System.out.print("=>");
		firstName =  sc.nextLine();
		service.printSearchResult(listFirstName, firstName);
	}
}
