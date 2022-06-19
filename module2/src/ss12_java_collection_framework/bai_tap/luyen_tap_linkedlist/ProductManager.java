package ss12_java_collection_framework.bai_tap.luyen_tap_linkedlist;

import ss12_java_collection_framework.bai_tap.luyen_tap_arraylist.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
  List<ss12_java_collection_framework.bai_tap.luyen_tap_arraylist.Product> listProduct = new ArrayList<>();

  public void add(ss12_java_collection_framework.bai_tap.luyen_tap_arraylist.Product product) {
    listProduct.add(product);
  }

  public void display() {
    for (ss12_java_collection_framework.bai_tap.luyen_tap_arraylist.Product element : listProduct) {
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
    boolean flag = false;
    for (ss12_java_collection_framework.bai_tap.luyen_tap_arraylist.Product product : listProduct) {
      if (product.getName().equals(name)) {
        System.out.println(product.toString());
        flag=true;
        break;
      }
    }
    if (!flag) {
      System.out.println("Not Found!");
    }
  }

  public boolean check(int id) {
    boolean flag = false;
    for (ss12_java_collection_framework.bai_tap.luyen_tap_arraylist.Product product : listProduct) {
      if (id == product.getId()) {
        flag = true;
      }
    }
    return flag;
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
        new Comparator<ss12_java_collection_framework.bai_tap.luyen_tap_arraylist.Product>() {
          @Override
          public int compare(ss12_java_collection_framework.bai_tap.luyen_tap_arraylist.Product o1, Product o2) {
            if (o1.getPrice() == o2.getPrice()) {
              return o1.getId() - o2.getId();
            }
            return (int) (o1.getPrice() - o2.getPrice());
          }
        });
  }
}
