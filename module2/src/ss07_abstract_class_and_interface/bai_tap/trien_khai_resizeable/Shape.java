package ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable;

public abstract class Shape {
  String colour="Black";

  public Shape() {
  }

  public Shape(String colour) {
    this.colour = colour;
  }
  public abstract String getInfo();

  public abstract double getArea();
}
