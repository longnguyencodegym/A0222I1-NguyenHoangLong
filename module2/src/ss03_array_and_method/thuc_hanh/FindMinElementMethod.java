package ss03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class FindMinElementMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArr;
        int size, min, minIndex;
        System.out.println("Input Number of Element:");
        size = sc.nextInt();
        numberArr = new int[size];
        for (int i = 0; i < numberArr.length; i++) {
            System.out.println("Element " + (i + 1) + ":");
            numberArr[i] = sc.nextInt();
        }
        System.out.println("Element in Array:");
        for (int i = 0; i < numberArr.length; i++) {
            System.out.printf("%3d", numberArr[i]);

        }
        System.out.println("\n Min: " + numberArr[minIndex(numberArr)] + "    Min Index: " + (minIndex(numberArr)+1));
    }

    public static int minIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}

