package model;

public class Circle extends Shape{

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.round(Math.PI * this.radius * this.radius * 100) / 100;
  }

  @Override
  public String print() {
    return "Circle\t\t" + this.getArea();
  }

  @Override
  public String toString() {
    return "Circle";
  }
}
