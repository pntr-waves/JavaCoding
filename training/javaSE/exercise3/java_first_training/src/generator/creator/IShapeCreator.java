package generator.creator;

import constant.UnitMetric;
import model.Shape;

public interface IShapeCreator<T extends Shape> {
  public T createShape(UnitMetric unit);
}
