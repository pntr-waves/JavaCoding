package truong.howtoprogram.chapter16.e1616;

import java.util.Scanner;

import truong.howtoprogram.chapter16.e1616.service.E1616Service;

public class E1616App {

//	Write a program that determines and prints the number of
//	duplicate words in a sentence. Treat uppercase and lowercase letters the same. Ignore punctuation.
	
	public static void main(String[] args) {
		E1616Service service = new E1616Service();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentences");
		System.out.print("=>");
		String inputString = sc.nextLine();
		service.printNumberDuplicateWords(inputString);

	}
}
