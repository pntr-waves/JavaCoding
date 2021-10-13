package Exercise811;

public class App {

	/*
	 * Create a class called Complex for performing arithmetic with complex numbers.
	 * Complex numbers have the form realPart + imaginaryPart * i
	 * 
	 * 
	 * Write a program to test your class. Use floating-point variables to represent
	 * the private data of the class. Provide a constructor that enables an object
	 * of this class to be initialized when it’s declared. Provide a no-argument
	 * constructor with default values in case no initializers are provided. Provide
	 * public methods that perform the following operations: a) Add two Complex
	 * numbers: The real parts are added together and the imaginary parts are added
	 * together. b) Subtract two Complex numbers: The real part of the right operand
	 * is subtracted from the real part of the left operand, and the imaginary part
	 * of the right operand is sub- tracted from the imaginary part of the left
	 * operand. c) Print Complex numbers in the form (realPart, imaginaryPart).
	 */

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(3, 4);
		ComplexNumber c2 = new ComplexNumber(1, 5);

		ComplexNumber addResult = addComplexNumbers(c1, c2);
		System.out.println("Add two Complex Number");
		System.out.println(c1.getRealPart() + " + " + c1.getImaginaryPart() + " * i");
		System.out.println("+");
		System.out.println(c2.getRealPart() + " + " + c2.getImaginaryPart() + " * i");
		System.out.println("---------------------");
		System.out.println(addResult.getRealPart() + (addResult.getImaginaryPart() > 0 ? " + " : " - ") + Math.abs(addResult.getImaginaryPart()) + " * i");

		ComplexNumber subResult = subComplexNumber(c1, c2);
		
		System.out.println("\nSub two Complex Number");
		System.out.println(c1.getRealPart() + " + " + c1.getImaginaryPart() + " * i");
		System.out.println("-");
		System.out.println(c2.getRealPart() + " + " + c2.getImaginaryPart() + " * i");
		System.out.println("---------------------");
		System.out.println(subResult.getRealPart() + (subResult.getImaginaryPart() > 0 ? " + " : " - ") + Math.abs(subResult.getImaginaryPart()) + " * i");
	}

	public static ComplexNumber addComplexNumbers(ComplexNumber c1, ComplexNumber c2) {
		double realPart = c1.getRealPart() + c2.getRealPart();
		double imaginaryPart = c1.getImaginaryPart() + c2.getImaginaryPart();

		return new ComplexNumber(realPart, imaginaryPart);
	}

	public static ComplexNumber subComplexNumber(ComplexNumber c1, ComplexNumber c2) {
		double realPart = c1.getRealPart() - c2.getRealPart();
		double imaginaryPart = c1.getImaginaryPart() - c2.getImaginaryPart();
		return new ComplexNumber(realPart, imaginaryPart);
	}

}
