package ss07_abstract_class_and_interface.bai_tap.trien_khai_interface_colorable;

import ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable.Resizeable;
import ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable.Shape;

public class Square extends Shape implements Colorable, Resizeable {
  private double side = 1;
  String colour;

  public Square() {}

  public Square(double side, String colour) {
    this.colour = colour;
    this.side = side;
  }

  public Square(double side) {
    this.side = side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  @Override
  public void howToColour() {
    System.out.println("Color all four sides: " + colour);
  }

  @Override
  public double getRandomPercent() {
    return (Math.floor(Math.random() * 100) + 1) / 100;
  }

  @Override
  public void resize(double percent) {
    System.out.println(
        "Square has Area after risize:" + getArea() * percent + "with resize percent:" + percent);
  }

  @Override
  public double getArea() {
    return getSide() * getSide();
  }

  @Override
  public String toString() {
    return "Square{" + "side=" + side + '}';
  }
@Override
  public String getInfo() {
    return "Area of Square: " + getArea();
  }
}
