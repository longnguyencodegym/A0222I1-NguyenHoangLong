package ss17_io_binary_file_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestProduct {
  static Scanner sc = new Scanner(System.in);
  static String link =
      "src/ss17_io_binary_file_serialization/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/product.bin";

  public static void writeObjectFile(List<Product> products, String path) {
    try (ObjectOutputStream objectOutputStream =
        new ObjectOutputStream(new FileOutputStream(path))) {
      objectOutputStream.writeObject(products);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static List<Product> readObjectFile(String path) {

        List<Product> products = new ArrayList<>();
    File file = new File(path);
    if (file.exists()) {
      try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {

        products= (List<Product>) objectInputStream.readObject();
      } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
      }
    }

    return products;
  }

  public static void main(String[] args) {

    boolean flag = true;
    do {
      System.out.print("Funtion:\n1.Add\n2.Display\n3.Search By Id\n0.Exit");
      System.out.print("\nYour choice:");
      int option = sc.nextInt();
      switch (option) {
        case 1:
          add();
          break;
        case 2:
          display();
          break;
        case 3:
          searchById();
          break;

        case 0:
          flag = false;
          break;

        default:
          System.out.println("Wrong choice!");
      }
    } while (flag);
  }

  public static void add() {
    List<Product> products = new ArrayList<>();
    System.out.print("Name:");
    String name = sc.next();
    System.out.print("Company:");
    String company = sc.next();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    System.out.print("Description:");
    String description = sc.next();
    products.add(new Product(name, company, price, description));
    writeObjectFile(products, link);
  }

  public static void display() {
    List<Product> productsOutputs = readObjectFile(link);
    for (Product product : productsOutputs) {
      System.out.println(product);
    }
  }

  public static void searchById() {
    System.out.print("Input Id to search:");
    int searchId = sc.nextInt();
    boolean flag = true;
    List<Product> productsOutputs = readObjectFile(link);
    for (Product product : productsOutputs) {
      if (product.getId() == searchId) {
        System.out.print(product);
      } else {
        flag = false;
      }
    }
    if (!flag) {
      System.out.println("Not Found!");
    }
  }
}
