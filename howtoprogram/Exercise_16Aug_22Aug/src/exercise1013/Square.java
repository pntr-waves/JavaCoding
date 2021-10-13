package exercise1013;

public class Square extends TwoDimensionalShape {

	private double width;

	public Square(double width) {
		if (width <= 0) {
			throw new IllegalArgumentException("width of square must be > 0");
		}
		this.width = width;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		if (width <= 0) {
			throw new IllegalArgumentException("width of square must be > 0");
		}
		this.width = width;
	}

	@Override
	public double getArea() {
		return Math.pow(this.width, 2);
	}
	
	@Override
	public String toString() {
		return "this is square";
	}

}
