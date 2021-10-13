package truong.howtoprogram.chapter16.e1615;

import java.util.Scanner;

import truong.howtoprogram.chapter16.e1614.service.E1614Service;
import truong.howtoprogram.chapter16.e1615.service.E1615Service;

public class E1615App {
//	Use a HashMap to create a reusable class for choosing one of the 13 pre-
//	defined colors in class Color. The names of the colors should be used as keys, and the predefined
//	Color objects should be used as values. Place this class in a package that can be imported into any
//	Java program. Use your new class in an application that allows the user to select a color and draw a
//	shape in that color.
	
	public static void main(String[] args) {
		E1615Service service = new E1615Service();
		String colorName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color name");
		System.out.println("=>");
		colorName = sc.nextLine();
		
		service.printValueColor(colorName);
	}	
}
