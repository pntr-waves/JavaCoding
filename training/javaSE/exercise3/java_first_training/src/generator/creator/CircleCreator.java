package generator.creator;

import java.util.Random;

import constant.UnitMetric;
import model.Circle;

public class CircleCreator implements IShapeCreator<Circle>{

  @Override
  public Circle createShape(UnitMetric unit) {
    Random random = new Random();
    double radius = random.nextDouble() * 99 + 1;
    System.out.println("Generate Circle");
    Circle circle = new Circle(radius, unit);
    return circle;
  }

}
