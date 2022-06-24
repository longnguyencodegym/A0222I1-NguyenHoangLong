package ss05_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {
    private double radius=1;
    private String colour="red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

      double getRadius() {
        return radius;
    }
    protected  double getArea(){
        return Math.PI*Math.pow(this.getRadius(),2);
    }
}
