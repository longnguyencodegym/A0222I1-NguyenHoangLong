package sso5_access_modifier_static_method_static_property.thuc_hanh.static_property;

public class TestStaticProperty {
  public static void main(String[] args) {
    //
    Car car1 = new Car("BMW1", "Turbo3");
    System.out.println(Car.numberOfCar);
    Car car2 = new Car("BMW2", "Turbo4");
    System.out.println(Car.numberOfCar);
  }
}
