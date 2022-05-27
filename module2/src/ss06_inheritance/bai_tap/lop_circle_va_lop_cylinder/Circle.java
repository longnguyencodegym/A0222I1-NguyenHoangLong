package ss06_inheritance.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius=1;
    private String colour="black";

    public Circle() {
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getArea(double radius){
        return Math.sqrt(radius)*Math.PI;
    }
    public String toString(){
        return "A Circle with radius="+radius+",and color of "+colour;
    }
}
