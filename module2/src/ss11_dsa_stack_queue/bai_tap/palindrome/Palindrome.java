package ss11_dsa_stack_queue.bai_tap.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input String:");
    String str = sc.nextLine();
    String[] stringArray = str.split("");
    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();
    for (String element : stringArray) {
      stack.push(element);
      queue.offer(element);
    }
    boolean flag = true;
    int lens=stack.size();
    for (int i=0;i<lens;i++) {
      if (!stack.pop().equals(queue.remove())) {
        flag = false;
        break;
      }
    }
    if (flag) {
      System.out.println("Input string is palindrome!");
    } else {
      System.out.println("Input string is not palindrome!");
    }
  }
}
