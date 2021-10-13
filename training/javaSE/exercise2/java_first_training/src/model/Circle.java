package model;

public class Circle {

  private double radius = 1;

  public Circle() {
  };

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public void setCircumference(double circumference) {
    this.radius = circumference / (2 * Math.PI);
  }

  public double getRadius() {
    return Math.ceil(this.radius * 10000) / 10000;
  }

  public double getCircumference() {
    return Math.ceil((this.radius * 2 * Math.PI) * 1000) / 1000;
  }

  public double getArea() {
    return Math.ceil((this.radius * this.radius * Math.PI) * 1000) / 1000;
  }

}
