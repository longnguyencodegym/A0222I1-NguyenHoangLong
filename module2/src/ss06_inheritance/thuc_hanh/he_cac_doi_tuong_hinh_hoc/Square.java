package ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side){
        super(side,side);
    }
    public Square(double side,String colour,boolean filled){
        super(side,side,colour,filled);
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public double getSide(){
        return  getLength();
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    public String toString(){
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }
}

