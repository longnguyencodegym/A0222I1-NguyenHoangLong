package ss12_java_collection_framework.bai_tap.luyen_tap_arraylist;

public class Product {
  private  static int tempId=0;
  public  int id;
  public String name;
  public double price;

  public Product() {}

  public Product( String name, double price) {
    this.id =tempId++;
    this.name = name;
    this.price = price;


  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setIdNamePrice(int id,String name,double price) {
    this.id=id;
    this.name=name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
  }
}
