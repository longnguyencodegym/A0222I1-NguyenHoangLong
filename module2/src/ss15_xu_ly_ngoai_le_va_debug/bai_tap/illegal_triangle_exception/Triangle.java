package ss15_xu_ly_ngoai_le_va_debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    System.out.println("Please enter 3 side of triangle!");
    System.out.println("side a:");
    a = sc.nextInt();
    System.out.println("side b:");
    b = sc.nextInt();
    System.out.println("side c:");
    c = sc.nextInt();
    try {
      Triangle.checkTriangle(a, b, c);
      System.out.println("Perfect Triangle!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void checkTriangle(int side1, int side2, int side3) throws Exception {
    if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
      throw new Exception("Sum of two edge must be bigger than remaining edge!");
    }
    if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
      throw new Exception("Edge must be bigger than zero!");
    }
  }
}
