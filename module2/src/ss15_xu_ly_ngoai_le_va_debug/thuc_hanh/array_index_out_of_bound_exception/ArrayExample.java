package ss15_xu_ly_ngoai_le_va_debug.thuc_hanh.array_index_out_of_bound_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nInput Index: ");
        int x = scaner.nextInt();
        try {
            System.out.println("value of " + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Out of Array");
        }
    }
}

