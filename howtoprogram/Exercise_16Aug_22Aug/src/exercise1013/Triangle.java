package exercise1013;

public class Triangle extends TwoDimensionalShape {

	private double height;
	private double base;

	public Triangle(double height, double base) {
		if (height <= 0) {
			throw new IllegalArgumentException("height of triangle must be > 0");
		}
		if (base <= 0) {
			throw new IllegalArgumentException("base of triangle must be > 0");
		}
		this.height = height;
		this.base = base;
	}

	public void setHeight(double height) {
		if (height <= 0) {
			throw new IllegalArgumentException("height of triangle must be > 0");
		}
		this.height = height;
	}

	public double getHeight() {
		return this.height;
	}

	public void setBase(double base) {
		if (base <= 0) {
			throw new IllegalArgumentException("base of triangle must be > 0");
		}
		this.base = base;
	}

	public double getBase() {
		return this.base;
	}

	@Override
	public double getArea() {
		return 0.5 * this.height * this.base;
	}
	
	@Override
	public String toString() {
		return "this is triangle";
	}
}
