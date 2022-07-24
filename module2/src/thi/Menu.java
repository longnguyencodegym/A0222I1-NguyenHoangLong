package ss16_io_text_file.bai_tap.quan_ly_dien_thoai;


import java.util.List;
import java.util.Scanner;

public class Menu {
  private static Scanner scanner = new Scanner(System.in);
  private static PhoneService phoneService = new PhoneService();

  public static void main(String[] args) {
    while (true) {
      System.out.println("----- Menu -----");
      System.out.println("1. Create");
      System.out.println("2. Display");
      System.out.println("3. Delete");
      System.out.println("4. Search");
      System.out.println("5. Exit");

      int choice = getChoice();

      switch (choice) {
        case 1:
          create();
          break;
        case 2:
          display();
          break;
        case 3:
          delete();
          break;
        case 4:
          search();
          break;
        case 5:
          System.exit(0);
      }
    }
  }

  private static void create() {
    System.out.println("1. Authentic\n2. Hand");
    int choice = getChoice();
    String name;
    boolean tmp = true;
    do {
      System.out.print(tmp?"Name:":"Wrong format. Input name again:");
      name=scanner.nextLine();
      tmp = Valid.checkName(name);
    } while (!tmp);

    String price ;
    do {
      System.out.print(tmp?"Price:":"Wrong format. Input Price again:");
      price = scanner.nextLine();
      tmp=Valid.isNumber(price);
    } while (!tmp);

    String manufacturer = inputWithEmpty("Manufacture");
    Phone phone;

    if (choice == 1) {
      int granteeByYear = Integer.parseInt(inputWithEmpty("Grantee By Year"));
      String code = inputWithEmpty("Grantee By Code");
      phone =
          new AuthenticPhone(0, name, Double.parseDouble(price), manufacturer, granteeByYear, code);
    } else {
      String country = inputWithEmpty("Country");
      String status = inputWithEmpty("Status");
      phone = new HandPhone(0, name, Double.parseDouble(price), manufacturer, country, status);
    }

    phoneService.create(phone);
    System.out.println("Created successfully");
  }

  private static void display() {
    List<Phone> phones = phoneService.findAll();

    for (int i = 0; i < phones.size(); i++) {
      System.out.println(phones.get(i));
    }
  }

  private static void delete() {

    display();
    if ((phoneService.findAll()).size()==0){
      System.out.println("Nothing to delete");
      return;
    }

    boolean tmp = false;

    do {
      System.out.print(tmp ? "Enter id to delete again:" : "Enter id to delete:");
      int id = Integer.parseInt(scanner.nextLine());

      try {
        phoneService.delete(id);
        System.out.println("Deleted successfully");
        tmp = false;
      } catch (NotFoundException e) {
        System.out.println(e.getMessage());
        tmp = true;

      }
    } while (tmp);
  }

  private static void search() {
    System.out.print("Input name to search:");
    String name = scanner.nextLine();
    List<Phone> phones = phoneService.search(name);

    if (phones.size() > 0) {
      for (int i = 0; i < phones.size(); i++) {
        System.out.println(phones.get(i));
      }
    } else {
      System.out.println("Empty list");
    }
  }

  private static int getChoice() {
    System.out.print("Enter your choice:");
    return Integer.parseInt(scanner.nextLine());
  }

  private static String inputWithEmpty(String field) {
    String val = "0";
    do {
      System.out.print(val.isEmpty() ? "Invalid format. Input again:" : field + ":");
      val = scanner.nextLine();
    } while (val.trim().isEmpty());

    return val;
  }
    }
