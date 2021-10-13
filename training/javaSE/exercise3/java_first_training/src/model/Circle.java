package model;

import constant.UnitMetric;

public class Circle extends Shape {

  private double radius;
  private UnitMetric unit;

  public Circle(UnitMetric unit) {
    this.radius = 0;
    this.unit = unit;
  }

  public Circle(double radius, UnitMetric unit) {
    this.radius = radius;
    this.unit = unit;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setUnit(UnitMetric unit) {
    this.unit = unit;
  }

  public UnitMetric getUnit() {
    return this.unit;
  }

  public double getArea() {
    return Math.PI * this.radius * this.radius;
  }

  @Override
  public String print() {
    return "Circle\t\t" + Math.floor(this.getArea() * 1000) / 1000 + " square " + this.unit.getTitle();
  }
}
