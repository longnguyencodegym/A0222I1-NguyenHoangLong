package ss06_inheritance.bai_tap.lop_point2d_point3d;

public class TestPoint2dPoint3d {
  public static void main(String[] args) {
    Point2d point2d = new Point2d();
    System.out.println(point2d);
    point2d = new Point2d(2, 3);
    System.out.println(point2d);
    float[] a=point2d.getXY();
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    Point3d point3d = new Point3d();
    System.out.println("\n"+point3d);
    point3d=new Point3d(1,2,3);
    System.out.println(point2d);
    float[] b=point3d.getXYZ();
    for (int i = 0; i < b.length; i++) {
      System.out.print(b[i]+" ");
    }
  }
}
