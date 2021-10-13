package model;

import constant.UnitMetric;

public abstract class Shape {
  abstract public String print();

  abstract public double getArea();

  abstract public UnitMetric getUnit();
}
