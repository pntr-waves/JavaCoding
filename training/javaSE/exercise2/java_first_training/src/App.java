import java.util.Random;
import java.util.Scanner;

import model.Circle;

public class App {
    public static void main(String[] args) throws Exception {
        doExercise2();
    }

    private static void doExercise2() {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean continueLoop = true;
        Unit unit;
        while (continueLoop) {
            System.out.println("----------------------------");
            System.out.println("1 - Enter circumference");
            System.out.println("0 - Exit");
            System.out.print("Select your choice: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    unit = randomUnit();
                    double circumference = inputCircumference(scanner, unit.getTitle());
                    Circle circle = new Circle();
                    double circumferenceMeter = convert(circumference, unit.getConvertValue());
                    circle.setCircumference(circumferenceMeter);
                    // print
                    print(circle);
                    continueLoop = noticeToContinue(scanner);
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
    }

    private static Unit randomUnit() {
        Random random = new Random();
        int randomUnit = random.nextInt(Unit.values().length) + 1;
        Unit unit = Unit.values()[randomUnit - 1];
        return unit;
    }

    private static boolean noticeToContinue(Scanner scanner) {
        int option = 0;
        System.out.println("Do you want to continue?");
        System.out.println("1 - Yes\t\t0 - No");
        System.out.print("=> ");
        option = scanner.nextInt();
        if (option == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static double inputCircumference(Scanner scanner, String title) {
        System.out.print("Enter circumference (" + title + ") ");
        double circumference = scanner.nextDouble();
        return circumference;
    }

    private static double convert(double value, double convertValue) {
        return value * convertValue;
    }

    private static void print(Circle circle) {
        System.out.println("Circle\n--------------");
        System.out.println("Circumference:\t" + circle.getCircumference() + " centimeter");
        System.out.println("Radius:\t\t" + circle.getRadius() + " centimeter");
        System.out.println("Area:\t\t" + circle.getArea() + " square centimeter");
    }

    public enum Unit {
        CM("cm", 1), INCH("inch", 2.54), DM("dm", 10);

        private double convertValue;
        private String title;

        Unit(String title, double convertValue) {
            this.title = title;
            this.convertValue = convertValue;
        }

        public String getTitle() {
            return this.title;
        }

        public double getConvertValue() {
            return this.convertValue;
        }
    }
    // private static int selectUnit(Scanner scanner) {
    // int unit = 1;
    // do {
    // System.out.println("Select unit of circumference");
    // System.out.println("1 - Cm\t\t2 - Inch");
    // System.out.print("Select your choice: ");
    // unit = scanner.nextInt();
    // } while (unit > 3);
    // return unit;
    // }
}
