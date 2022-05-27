package ss06_inheritance.bai_tap.lop_point_movable_point;

public class TestPoinMovablePoint {
  public static void main(String[] args) {
    Point point = new Point();
    System.out.println(point);
    point=new Point(1,2);
    System.out.println(point);
    MovablePoint movablePoint=new MovablePoint();
    System.out.println(movablePoint);
    movablePoint=new MovablePoint(1,2,3,4);
    movablePoint.move();
    System.out.println(movablePoint);
  }
}
