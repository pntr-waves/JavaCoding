package Exercise811;

public class ComplexNumber {
	private double realPart;
	private double imaginaryPart;

	ComplexNumber() {
		this.realPart = 0;
		this.imaginaryPart = 0;
	}

	ComplexNumber(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

}
