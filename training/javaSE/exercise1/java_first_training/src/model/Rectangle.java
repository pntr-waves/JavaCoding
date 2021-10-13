package model;

public class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
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

  public double getArea() {
    return Math.round(this.length * this.width * 100) / 100;
  }

  @Override
  public String print() {
    return "Rectangle\t" + this.getArea();
  }

  @Override
  public String toString() {
    return "Rectangle";
  }
}