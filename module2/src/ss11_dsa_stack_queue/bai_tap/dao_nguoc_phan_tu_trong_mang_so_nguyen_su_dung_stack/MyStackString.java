package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.ArrayList;
import java.util.Stack;

public class MyStackString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Long");
        list.add("Duyet");
        list.add("Vuong");
        list.add("Tuan");
        System.out.println("Array before sort:");
        System.out.println(list);
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));

        }
        list.removeAll(list);
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        System.out.println("Array after sort:");
        System.out.println(list);
    }
}
