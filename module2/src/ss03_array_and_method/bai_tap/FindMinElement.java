package ss03_array_and_method.bai_tap;

import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;

        System.out.print("Input number Element:");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for (int element : array) System.out.print(element + " ");
        findMinElement(array);

    }
    public static void findMinElement(int[] array){
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        System.out.print("\n Min in Array: " + array[minIndex] + " at: " + (minIndex + 1));
    }
}
