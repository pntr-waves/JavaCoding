package truong.howtoprogram.chapter16.e1614;

import java.util.Scanner;

import truong.howtoprogram.chapter16.e1614.service.E1614Service;

public class E1614App {
//	Modify the program of Fig. 16.18 to count the number of occurrences
//	of each letter rather than of each word. For example, the string "HELLO THERE" contains two Hs, three
//	Es, two Ls, one O, one T and one R. Display the results.

	public static void main(String[] args) {
		E1614Service service = new E1614Service();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		System.out.print("=>");
		String inputString = sc.nextLine();
		service.printResult(inputString);
 	}
}
