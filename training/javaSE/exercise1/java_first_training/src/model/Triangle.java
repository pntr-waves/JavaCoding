package model;

public class Triangle extends Shape {

  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
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

  public double getArea() {
    return Math.round(0.5 * this.base * this.height * 100) / 100;
  }

  @Override
  public String print() {
    return "Triangle\t" + this.getArea();
  }

  @Override
  public String toString() {
    return "Triangle";
  }
}
