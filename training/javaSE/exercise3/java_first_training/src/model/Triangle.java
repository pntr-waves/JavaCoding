package model;

import constant.UnitMetric;

public class Triangle extends Shape {

  private double base;
  private double height;
  private UnitMetric unit;

  public Triangle(UnitMetric unit) {
    this.base = 0;
    this.height = 0;
    this.unit = unit;
  }

  public Triangle(double base, double height, UnitMetric unit) {
    this.base = base;
    this.height = height;
    this.unit = unit;
  }

  public double getBase() {
    return this.base;
  }

  public double getHeight() {
    return this.height;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setUnit(UnitMetric unit) {
    this.unit = unit;
  }

  public UnitMetric getUnit() {
    return this.unit;
  }

  public double getArea() {
    return 0.5 * this.base * this.height;
  }

  @Override
  public String print() {
    return "Triangle\t" + Math.floor(this.getArea() * 1000) / 1000 + " square " + this.unit.getTitle();
  }

}
