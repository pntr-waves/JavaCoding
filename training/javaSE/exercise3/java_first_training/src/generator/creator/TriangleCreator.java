package generator.creator;

import java.util.Random;

import constant.UnitMetric;
import model.Triangle;

public class TriangleCreator implements IShapeCreator<Triangle> {

  @Override
  public Triangle createShape(UnitMetric unit) {
    Random random = new Random();
    double height = random.nextDouble() * 99 + 1;
    double base = random.nextDouble() * 99 + 1;
    System.out.println("Generate Triangle");
    Triangle triangle = new Triangle(height, base, unit);
    return triangle;
  }
}
