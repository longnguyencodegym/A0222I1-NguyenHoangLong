package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_tu_trong_chuoi_su_dung_map;

import java.util.*;

public class TreeMap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input Strings:");
    String string = sc.nextLine();
    string = string.toLowerCase();

    ArrayList<String> list = new ArrayList<>();
    String[] key = string.split("");
    for (String element : key) {
      if (!element.equals(" ")) {
        list.add(element);
      }
    }
    Map<String, Integer> map = new HashMap<>();

    for (String element : list) {
      if (!map.containsKey(element)) {
        map.put(element, 1);
      } else {
        int value = map.get(element);
        value++;
        map.put(element, value);
      }
    }
    System.out.println(map);
//    Set<String> keys = map.keySet();
//    for (String element : keys) {
//      System.out.println("Key: " + element + ":" + map.get(element));
    }
  }

