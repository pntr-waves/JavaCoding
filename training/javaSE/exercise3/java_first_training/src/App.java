import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import generator.IShapeGenerator;
import generator.ShapeGenerator;
import model.Shape;
import tools.Tools;

public class App implements Tools {
    public static void main(String[] args) throws Exception {
        // doExercise3();
        System.out.println(IShapeGenerator.class);
        System.out.println(ShapeGenerator.class);
    }

    private static void doExercise3() {
        List<Shape> shapes = new ArrayList<Shape>();
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        int option;
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        while (continueLoop) {
            System.out.println("----------------------------");
            System.out.println("1 - Add item to list");
            System.out.println("2 - Show all item in list");
            System.out.println("0 - Exit");
            System.out.print("=> ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addItemToList(shapes, shapeGenerator);
                    break;
                case 2:
                    if (shapes.isEmpty()) {
                        System.out.println("----------------------------");
                        System.out.println("This list is Empty!!");
                    } else {
                        printList(shapes);
                    }
                    break;
                case 0:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("----------------------------");
                    System.out.println("Warn: this option is not valid!!");
                    break;
            }
        }
        scanner.close();
    }

    public static void addItemToList(List<Shape> shapes, ShapeGenerator shapeGenerator) {
        Shape shape = shapeGenerator.createShape();
        shapes.add(shape);
    }

    public static void printList(List<Shape> shapes) {
        App app = new App();
        double sumArea = 0;

        // print result
        System.out.println("Shapes\t\tArea\n----------------------");
        for (Shape s : shapes) {
            sumArea += app.convertArea(s.getArea(), s.getUnit());
            System.out.println(s.print());
        }
        System.out.println("----------------------\nTotal\t\t" + app.floor(sumArea) + " square centimeter");
    }

    public static abstract class ListComparator implements Comparator<Shape> {
        abstract public int getSortIndex(Shape s);

        public int compare(Shape o1, Shape o2) {
            return getSortIndex(o1) - getSortIndex(o2);
        }
    }
}
