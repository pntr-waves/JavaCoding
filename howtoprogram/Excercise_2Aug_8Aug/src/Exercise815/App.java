package Exercise815;

public class App {
	
	/*
	 * 
	 * Create a class called Rational for performing arithmetic with fractions.
Write a program to test your class. Use integer variables to represent the private instance variables
of the class—the numerator and the denominator. Provide a constructor that enables an object of this class to be initialized when it’s declared. The constructor should store the fraction in reduced
form.

*	Pro-
vide public methods that perform each of the following operations:
a) Add two Rational numbers: The result of the addition should be stored in reduced
form. Implement this as a static method.
b) Subtract two Rational numbers: The result of the subtraction should be stored in re-
duced form. Implement this as a static method.
c) Multiply two Rational numbers: The result of the multiplication should be stored in
reduced form. Implement this as a static method.
d) Divide two Rational numbers: The result of the division should be stored in reduced
form. Implement this as a static method.
e) Return a String representation of a Rational number in the form a/b, where a is the
numerator and b is the denominator.
f)
Return a String representation of a Rational number in floating-point format. (Con-
sider providing formatting capabilities that enable the user of the class to specify the
number of digits of precision to the right of the decimal point.)
*
*/
	public static void main(String[] args) {
		
		RationalNumber r1 = initRationalNumber(3, 4);
		System.out.println(r1.getNumerator() + "/" + r1.getDenominator() + " = "
				+ (double) r1.getNumerator() / r1.getDenominator());
		RationalNumber r2 = initRationalNumber(4, 5);
		System.out.println(r2.getNumerator() + "/" + r2.getDenominator() + " = "
				+ (double) r1.getNumerator() / r1.getDenominator());
		RationalNumber add = add(r1, r2);
		System.out.println(r1.getNumerator() + "/" + r1.getDenominator() + " + " + r2.getNumerator() + "/"
				+ r2.getDenominator() + " = " + add.getNumerator() + "/" + add.getDenominator());
		RationalNumber sub = subtract(r1, r2);
		System.out.println(r1.getNumerator() + "/" + r1.getDenominator() + " - " + r2.getNumerator() + "/"
				+ r2.getDenominator() + " = " + sub.getNumerator() + "/" + sub.getDenominator());
		RationalNumber mul = multiply(r1, r2);
		System.out.println(r1.getNumerator() + "/" + r1.getDenominator() + " x " + r2.getNumerator() + "/"
				+ r2.getDenominator() + " = " + mul.getNumerator() + "/" + mul.getDenominator());
		RationalNumber div = divide(r1, r2);
		System.out.println(r1.getNumerator() + "/" + r1.getDenominator() + " / " + r2.getNumerator() + "/"
				+ r2.getDenominator() + " = " + div.getNumerator() + "/" + div.getDenominator());
	}

	public static RationalNumber initRationalNumber(int numerator, int denominator) {
		RationalNumber rn = null;
		int numberGCD = getGCD(Math.abs(numerator), Math.abs(denominator));
		rn = new RationalNumber(numerator / numberGCD, denominator / numberGCD);
		return rn;
	}

	public static int getGCD(int a, int b) {
		if (b == 0)
			return a;
		return getGCD(b, a % b);
	}

	public static int getLCM(int a, int b) {
		return (a * b) / getGCD(a, b);
	}

	public static RationalNumber add(RationalNumber r1, RationalNumber r2) {
		int denominator = getLCM(r1.getDenominator(), r2.getDenominator());
		int numerator = r1.getNumerator() * (denominator / r1.getDenominator())
				+ r2.getNumerator() * (denominator / r2.getDenominator());
		RationalNumber result = initRationalNumber(numerator, denominator);
		return result;
	}

	public static RationalNumber subtract(RationalNumber r1, RationalNumber r2) {
		int denominator = getLCM(r1.getDenominator(), r2.getDenominator());
		int numerator = r1.getNumerator() * (denominator / r1.getDenominator())
				- r2.getNumerator() * (denominator / r2.getDenominator());
		RationalNumber result = initRationalNumber(numerator, denominator);
		return result;
	}

	public static RationalNumber multiply(RationalNumber r1, RationalNumber r2) {
		int denominator = r1.getDenominator() * r2.getDenominator();
		int numerator = r1.getNumerator() * r2.getNumerator();
		RationalNumber result = initRationalNumber(numerator, denominator);
		return result;
	}

	public static RationalNumber divide(RationalNumber r1, RationalNumber r2) {
		int denominator = r1.getDenominator() * r2.getNumerator();
		int numerator = r1.getNumerator() * r2.getDenominator();
		RationalNumber result = initRationalNumber(numerator, denominator);
		return result;
	}

}
