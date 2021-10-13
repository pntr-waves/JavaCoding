package Exercise815;

public class RationalNumber {
	private int numerator;
	private int denominator;

	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public RationalNumber() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

}
