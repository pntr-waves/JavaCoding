package model;

public class Square extends Shape {
  private double side;

  public Square(double side ) {
    this.side = side;
  }

  public double getSide() {
    return this.side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getArea() {
    return Math.round(this.side * this.side * 100) / 100;
  }

  @Override
  public String print() {
    return "Square\t\t" + this.getArea();
  }

  @Override
  public String toString() {
    return "Square";
  }
}
