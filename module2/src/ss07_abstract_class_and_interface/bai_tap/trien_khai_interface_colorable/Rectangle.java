package ss07_abstract_class_and_interface.bai_tap.trien_khai_interface_colorable;

import ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable.Resizeable;
import ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width=1;
    private double length=1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimetter(double width,double length){
        return 2*(width+length);
    }
    @Override
    public String getInfo() {
        return "Area of Rectangle: " + getArea();
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }

    @Override
    public double getRandomPercent() {
        return (Math.floor(Math.random()*100)+1)/100;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Rectangle has Area after risize:"+getArea()*percent+"with resize percent:"+percent);
    }
    @Override
    public double getArea(){
        return getWidth()*getLength();
    }

}
