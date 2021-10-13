package generator.creator;

import java.util.Random;

import constant.UnitMetric;
import model.Rectangle;

public class RectangleCreator implements IShapeCreator<Rectangle> {

  @Override
  public Rectangle createShape(UnitMetric unit) {
    Random random = new Random();
    double length = random.nextDouble() * 100 + 1;
    double width = random.nextDouble() * 100 + 1;
    System.out.println("Generate Rectangle");
    Rectangle rectangle = new Rectangle(length, width, unit);
    return rectangle;
  }

}
