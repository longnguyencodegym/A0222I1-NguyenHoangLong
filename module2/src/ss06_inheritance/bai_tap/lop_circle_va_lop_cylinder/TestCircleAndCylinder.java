package ss06_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class TestCircleAndCylinder {
  public static void main(String[] args) {
    Circle circle = new Circle();
    System.out.println(circle);
     circle = new Circle(2,"Pink");
    System.out.println(circle);
    System.out.println(circle.getArea(circle.getRadius()));
    Cylinder cylinder=new Cylinder();
    System.out.println(cylinder);
    cylinder=new Cylinder(2);
    System.out.println(cylinder);
    cylinder=new Cylinder(2,"Green",3);
    System.out.println(cylinder);



  }
}
