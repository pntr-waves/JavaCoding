package generator;

import java.util.Random;

import model.Shape;
import constant.ShapeType;
import constant.UnitMetric;

public interface IShapeGenerator{

  default UnitMetric randomUnit(Random random) {
    int index = random.nextInt(UnitMetric.values().length) + 1;
    return UnitMetric.values()[index - 1];
  }

  default ShapeType randomTypeShape(Random random) {
    int index = random.nextInt(ShapeType.values().length) + 1;
    return ShapeType.values()[index - 1];
  }

  public Shape createShape();
}