package ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape{
    private double width=1;
    private double length=1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String colour,boolean filled) {
        super(colour,filled);
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
    public double getArea(double width,double length){
        return width*length;
    }
    public double getPerimetter(double width,double length){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }
}
