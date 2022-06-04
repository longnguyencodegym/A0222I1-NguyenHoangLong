package ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable;

public class TestResizeable {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(3);
    shapes[1] = new Square(2);
    shapes[2] = new Rectangle(2, 3);
    System.out.println("Before:");
    for (Shape shape : shapes) {
      System.out.print(shape.getArea() + " ");
    }
    System.out.println("\nAfter:");
    for (Shape shape : shapes) {
        ((Resizeable) shape).resize(((Resizeable) shape).getRandomPercent());

    }
  }
}
