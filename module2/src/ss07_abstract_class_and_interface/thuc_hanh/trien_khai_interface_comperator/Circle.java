package ss07_abstract_class_and_interface.thuc_hanh.trien_khai_interface_comperator;


public class Circle  {
    private double radius = 1;
    Circle(){
    }
    Circle(double radius){
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

