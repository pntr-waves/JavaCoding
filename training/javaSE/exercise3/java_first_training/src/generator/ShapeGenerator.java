package generator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import constant.ShapeType;
import constant.UnitMetric;
import generator.creator.CircleCreator;
import generator.creator.IShapeCreator;
import generator.creator.RectangleCreator;
import generator.creator.TriangleCreator;
import model.Shape;

public class ShapeGenerator implements IShapeGenerator {
  private Map<ShapeType, IShapeCreator<?>> shapeMap = new HashMap<ShapeType, IShapeCreator<?>>();

  @Override
  public Shape createShape() {
    Random random = new Random();
    UnitMetric unit = randomUnit(random);
    ShapeType shapeType = randomTypeShape(random);
    addCreatorToMap(shapeType);
    Shape shape = this.shapeMap.get(shapeType).createShape(unit);
    return shape;
  }

  public void addCreatorToMap(ShapeType key) {
    if (!this.shapeMap.containsKey(key)) {
      switch (key) {
        case TRIANGLE:
          this.shapeMap.put(key, new TriangleCreator());
          break;
        case RECTANGLE:
          this.shapeMap.put(key, new RectangleCreator());
          break;
        case CIRCLE:
          this.shapeMap.put(key, new CircleCreator());
          break;
      }
    }
  }
}
