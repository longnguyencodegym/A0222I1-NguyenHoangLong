package ss06_inheritance.bai_tap.thiet_ke_trien_khai_lop_triangle;

import java.util.Scanner;

public class TestTriangleShape {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double side1, side2, side3;
    String colour;
    System.out.println("Colour of Triangle:");
    colour = sc.nextLine();
    System.out.println("3 three side of Triangle:");
    System.out.println("side 1:");
    side1 = sc.nextDouble();
    System.out.println("side 2:");
    side2 = sc.nextDouble();
    System.out.println("side 3:");
    side3 = sc.nextDouble();




    Triangle triangle = new Triangle(colour, true, side1, side2, side3);
    System.out.println(
        "Triangle has: Area: "
            + triangle.getArea()
            + " "
            + "Perimeter: "
            + triangle.getPerimeter()
            + ", and colour of Triangle is "
            + triangle.getColour());
  }
}
