package ss12_java_collection_framework.bai_tap.luyen_tap_arraylist_linkedlist;

import java.util.Collection;
import java.util.Scanner;

public class TestProduct {
  public static Scanner sc = new Scanner(System.in);
  public static ProductManager productManager = new ProductManager();

  public static void main(String[] args) {
    boolean flag = true;
    do {
      System.out.print("Funtion:\n1.Add\n2.Delete By Id\n3.Display\n4.Edit By Id\n5.Search By Name\n6.Sort By Price\n7.Exit");
      System.out.print("\nYour choice:");
      int option = sc.nextInt();
      switch (option) {
        case 1:
          add();
          break;
        case 2:
          delete();
          break;
        case 3:
          display();
          break;
        case 4:
          edit();
          break;
        case 5:
          searchByName();
          break;
        case 6:
          sort();
          break;
        case 7:
          flag = false;
          break;

        default:
          System.out.println("Wrong choice!");
      }
    } while (flag);
  }

  public static void add() {
    System.out.println("Id:");

    int id = sc.nextInt();
    if (productManager.check(id)) {
      System.out.println("Exist Id. Please choose option 3 to edit this Id!");
      return;
    }
    System.out.println("Name:");
    String name = sc.next();
    System.out.println("Price:");
    double price = sc.nextDouble();
    Product product = new Product(id, name, price);
    productManager.add(product);
  }

  public static void display() {
    if (productManager.isEmpty()){
      System.out.println("Nothing to show.Please add new product!");
    }else {
      productManager.display();
    }
  }

  public static void delete() {
    display();
    System.out.println("Delete Id:");
    int id = sc.nextInt();
    productManager.delete(id);
  }

  public static void edit() {
    display();
    System.out.println("Edit Id:");
    int id = sc.nextInt();
    System.out.println("Edit Name:");
    String name = sc.next();
    System.out.println("Edit Price:");
    double price = sc.nextDouble();
    productManager.delete(id);
    Product editProduct = new Product(id, name, price);
    productManager.add(editProduct);
  }

  public static void searchByName() {
    System.out.println("Search Name:");
    String name = sc.next();
    productManager.search(name);
  }
  public static void sort(){
    productManager.sort();
  }

}
