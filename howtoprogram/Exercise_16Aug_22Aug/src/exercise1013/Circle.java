package exercise1013;

public class Circle extends TwoDimensionalShape {

	private double radius;

	public Circle(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("radius of circle must be > 0");
		}
		this.radius = radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("radius of circle must be > 0");
		}
		this.radius = radius;
	}

	public double getRaidus() {
		return this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public String toString() {
		return "this is circle";
	}

}
