package ss07_abstract_class_and_interface.bai_tap.trien_khai_resizeable;

import ss06_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;

public class Square extends Shape implements Resizeable {
  private double side = 1;
  String colour;
  public Square() {
  }

  public Square(double side, String colour) {
    super(colour);
    this.side = side;

  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public Square(double side) {
    this.side = side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  @Override
  public double getRandomPercent() {
    return (Math.floor(Math.random() * 100) + 1) / 100;
  }

  @Override
  public void resize(double percent) {
    System.out.println(
        "Square has Area after risize:" + getArea() * percent + "with resize percent:" + percent);
  }

  @Override
  public double getArea() {
    return getSide() * getSide();
  }

  @Override
  public String toString() {
    return "Square{" + "side=" + side + '}';
  }

  @Override
  public String getInfo() {
    return null;
  }
}
