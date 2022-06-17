package ss11_dsa_stack_queue.thuc_hanh.trien_khai_stack_su_dung_linkedlist;

import ss11_dsa_stack_queue.thuc_hanh.MyGenericStack;

public class GenericStackClient {
  public static void main(String[] args) {
    System.out.print("Stack of Integers:");
    stackOfIntegers();
    System.out.print("Stack of String:");
    stackOfString();
  }

  private static void stackOfString() {
    MyGenericStack<String> stack = new MyGenericStack<>();
    stack.push("five");
    stack.push("four");
    stack.push("three");
    stack.push("two");
    stack.push("one");
    System.out.println("Size of stack after push:" + stack.size());
    System.out.print("Pop element from stack:");
    while (!stack.isEmpty()) {
      System.out.printf(" %s", stack.pop());
    }
    System.out.println("\nSize of stack after pop:" + stack.size());
  }

  private static void stackOfIntegers() {
    MyGenericStack<Integer> stack = new MyGenericStack<>();
    stack.push(5);
    stack.push(4);
    stack.push(3);
    stack.push(2);
    stack.push(1);
    System.out.println("Size of stack after push:" + stack.size());
    System.out.print("Pop element from stack:");
    while (!stack.isEmpty()) {
      System.out.printf(" %s", stack.pop());
    }
    System.out.println("\nSize of stack after pop:" + stack.size());
  }
}
