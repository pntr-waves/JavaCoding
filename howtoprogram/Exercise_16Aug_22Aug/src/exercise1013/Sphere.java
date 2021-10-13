package exercise1013;

public class Sphere extends ThreeDimensionalShape {

	private double radius;

	public Sphere(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("radius of sphere must be > 0");
		}
		this.radius = radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("radius of sphere must be > 0");
		}
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	@Override
	public double getVolume() {
		return (4 * Math.PI * Math.pow(this.radius, 3)) / 3;
	}

	@Override
	public double getArea() {
		return 4 * Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "this is sphere";
	}
}
