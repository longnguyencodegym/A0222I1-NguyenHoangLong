package ss07_abstract_class_and_interface.bai_tap.trien_khai_interface_colorable;

import ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable.Shape;

public class TestSquare {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(4);
    shapes[1] = new Rectangle(2, 3);
    shapes[2] = new Square(2, "Green");
    for (Shape shape : shapes) {
      System.out.println(shape.getInfo());
      if (shape instanceof Colorable) {
        ((Colorable) shape).howToColour();
      }
    }
  }
}
