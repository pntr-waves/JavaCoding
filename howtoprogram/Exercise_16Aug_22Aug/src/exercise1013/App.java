package exercise1013;

public class App {

//	Implement the Shape hierarchy shown in Fig. 9.3. Each Two-
//	DimensionalShape should contain method getArea to calculate the area of the two-dimensional
//	shape. Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the
//	surface area and volume, respectively, of the three-dimensional shape. Create a program that uses
//	an array of Shape references to objects of each concrete class in the hierarchy. The program should
//	print a text description of the object to which each array element refers. Also, in the loop that pro-
//	cesses all the shapes in the array, determine whether each shape is a TwoDimensionalShape or a
//	ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s a ThreeDimension-
//	alShape, display its area and volume.

	public static void main(String[] args) {
		Circle circle = new Circle(3);
		Sphere sphere = new Sphere(5);
		Square square = new Square(4);
		Triangle triangle = new Triangle(3, 4);

		Shape[] listOfShape = { circle, sphere, square, triangle };

		for (Shape currentShape : listOfShape) {
			if (currentShape instanceof TwoDimensionalShape) {
				TwoDimensionalShape d2s = (TwoDimensionalShape) currentShape;
				System.out.println(d2s.toString() + " " + d2s.getArea());
			}
			
			if(currentShape  instanceof ThreeDimensionalShape) {
				ThreeDimensionalShape d3s = (ThreeDimensionalShape) currentShape;
				System.out.println(d3s.toString() + " " + d3s.getArea() + " - " + d3s.getVolume());
			}
		}
	}
}
