package ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable;

public class Circle extends Shape implements Resizeable {
  public double radius = 1;

  Circle() {}

  Circle(double radius) {
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }


  public double getPerimetter(double radius) {
    return Math.PI * 2 * radius;
  }

  @Override
  public String toString() {
    return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
  }


  @Override
  public void resize(double percent) {
    System.out.println("Circle has Area after risize:"+getArea()*percent+"with resize percent:"+percent);
  }

  @Override
  public double getArea() {
    return Math.PI * Math.sqrt(radius);
  }

  @Override
  public double getRandomPercent() {
    return (Math.floor(Math.random()*100)+1)/100;
  }

  @Override
  public String getInfo() {
    return null;
  }
}
