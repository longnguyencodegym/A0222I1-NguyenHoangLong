package ss07_abstract_class_and_interface.bai_tap.trien_khai_interface_colorable;

import ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable.Resizeable;
import ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable.Shape;

public class Circle extends Shape {
  public double radius = 1;

  Circle() {}

  Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getPerimetter(double radius) {
    return Math.PI * 2 * radius;
  }

  @Override
  public String getInfo() {
    return "Area of Circle: " + getArea();
  }

  @Override
  public String toString() {
    return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
  }

  @Override
  public double getArea() {
    return Math.PI * Math.sqrt(radius);
  }
  }

