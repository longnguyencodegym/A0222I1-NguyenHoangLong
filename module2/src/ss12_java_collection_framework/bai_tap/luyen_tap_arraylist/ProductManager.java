package ss12_java_collection_framework.bai_tap.luyen_tap_arraylist;

import java.util.*;

public class ProductManager {
  List<Product> listProduct = new LinkedList<>();

  public void add(Product product) {
    listProduct.add(product);
  }

  public void display() {
    for (Product element : listProduct) {
      System.out.println(element.toString());
    }
  }

  public void delete(int id) {
    for (int i = 0; i < listProduct.size(); i++) {
      if (listProduct.get(i).getId() == id) {
        listProduct.remove(i);
      }
    }
  }

  public void search(String name) {
    boolean flag = true;
    for (Product product : listProduct) {
      if (product.getName().equals(name)) {
        System.out.println(product.toString());
        flag = false;
      }
    }
    if (flag) {
      System.out.println("Not Found!");
    }
  }

  public void edit(int id,String name, double price) {
    listProduct.get(id).setIdNamePrice(id,name,price);
  }

  public boolean isEmpty() {
    if (listProduct.size() == 0) {
      return true;
    }
    return false;
  }

  public void sort() {
    Collections.sort(
        listProduct,
        new Comparator<Product>() {
          @Override
          public int compare(Product o1, Product o2) {
            if (o1.getPrice() == o2.getPrice()) {
              return o1.getId() - o2.getId();
            }
            return (int) (o1.getPrice() - o2.getPrice());
          }
        });
  }
}
