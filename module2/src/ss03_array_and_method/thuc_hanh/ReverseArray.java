package ss03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size:");
            size = sc.nextInt();
            if (size > 20||size < 0) {
                System.out.println("out of range 0-20");
            }
        } while (size > 20 || size < 0);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println("Element in array:");
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%3d", array[j]);
        }

        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.println("\n Element in reverse array:");
        for (int k = 0; k < array.length; k++) {
            System.out.printf("%3d", array[k]);
        }
    }
}
