package model;

import constant.UnitMetric;

public class Rectangle extends Shape{
  private double length;
  private double width;
  private UnitMetric unit;

  public Rectangle(UnitMetric unit) {
    this.length = 0;
    this.width = 0;
    this.unit = unit;
  }

  public Rectangle(double length, double width, UnitMetric unit) {
    this.length = length;
    this.width = width;
    this.unit = unit;
  }

  public double getLength() {
    return this.length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setUnit(UnitMetric unit) {
    this.unit = unit;
  }

  public UnitMetric getUnit() {
    return this.unit;
  }

  public double getArea() {
    return this.length * this.width;
  }

  @Override
  public String print() {
    return "Rectangle\t" + Math.floor(this.getArea() * 1000) / 1000 + " square " + this.unit.getTitle();
  }
}