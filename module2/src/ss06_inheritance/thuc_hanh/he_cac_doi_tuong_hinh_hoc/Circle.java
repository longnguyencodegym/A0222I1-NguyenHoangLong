package ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

 public class Circle extends Shape {
  private double radius = 1;
  Circle(){
  }
  Circle(double radius){
    this.radius=radius;
  }
  Circle(double radius, String colour, boolean filled){
    super(colour,filled);
    this.radius=radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  public double getArea(double radius){
    return Math.PI*Math.sqrt(radius);
  }
  public double getPerimetter(double radius){
    return Math.PI*2*radius;
  }

  @Override
  public String toString() {
    return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
  }
}
