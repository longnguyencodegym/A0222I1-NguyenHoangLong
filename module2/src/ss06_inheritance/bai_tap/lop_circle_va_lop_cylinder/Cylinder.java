package ss06_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
  private double height = 1;

  public Cylinder() {}

  public Cylinder(double height) {
    this.height = height;
  }

  public Cylinder(double radius, String colour, double height) {
    super(radius, colour);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume(double radius) {
    return getArea(radius) * height;
  }

  @Override
  public String toString() {
    return "A Cylinder with radius="
        + getRadius()
        + " and height="
        + getHeight()
        + ", which is a subclass of "
        + super.toString();
  }
}
