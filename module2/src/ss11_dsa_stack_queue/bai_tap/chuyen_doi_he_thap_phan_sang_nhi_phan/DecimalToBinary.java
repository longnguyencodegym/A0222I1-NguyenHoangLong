package ss11_dsa_stack_queue.bai_tap.chuyen_doi_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input Decimal Number: ");
    int num = sc.nextInt();
    Stack<Integer> stack = new Stack();
    while (num / 2 != 0) {
      stack.push(num % 2);
      num = num/2;
    }
    System.out.print("Output Binary number:");
    for (int element : stack) {
      System.out.printf("%s",element);
    }

  }
}
