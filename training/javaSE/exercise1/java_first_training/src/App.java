import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;
import model.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        doExercise1();
    }

    private static void doExercise1() {
        List<Shape> shapes = new ArrayList<Shape>();
        double sumArea = 0;
        addItemtoArray(shapes, 10);
        // comparator
        // sort shapes
        App.ListComparator listComparator = new App.ListComparator() {
            @Override
            public int getSortIndex(Shape s) {
                if (s instanceof Circle) {
                    return 1;
                } else if (s instanceof Triangle) {
                    return 2;
                } else if (s instanceof Rectangle) {
                    return 3;
                } else {
                    return 4;
                }
            }
        };
        shapes.sort(listComparator);
        // print result
        System.out.println("List sort with order is Rectangle Circle Square Triangle");
        System.out.println("Shapes\t\tArea\n----------------------");
        for (Shape s : shapes) {
            sumArea += s.getArea();
            System.out.println(s.print());
        }
        System.out.println("----------------------\nTotal\t\t" + sumArea);
    }

    // init shape in list
    private static void addItemtoArray(List<Shape> shapes, int numShapes) {
        for (int i = 0; i < numShapes; i++) {
            Shape shape;
            Random random = new Random();
            int type = random.nextInt(4) + 1;
            if (type == 1) {
                double radius = random.nextDouble() * 5 + 1;
                shape = new Circle(radius);
            } else if (type == 2) {
                double base = random.nextDouble() * 5 + 1;
                double height = random.nextDouble() * 5 + 1;
                shape = new Triangle(base, height);
            } else if (type == 3) {
                double length = random.nextDouble() * 5 + 1;
                double width = random.nextDouble() * 5 + 1;
                while (length == width) {
                    width = random.nextDouble() * 5 + 1;
                }
                shape = new Rectangle(length, width);
            } else {
                double side = random.nextDouble() * 5 + 1;
                shape = new Square(side);
            }
            shapes.add(shape);
        }
    }

    public static abstract class ListComparator implements Comparator<Shape> {
        abstract public int getSortIndex(Shape s);

        public int compare(Shape o1, Shape o2) {
            return getSortIndex(o1) - getSortIndex(o2);
        }
    }
}
