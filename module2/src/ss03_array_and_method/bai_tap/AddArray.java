package ss03_array_and_method.bai_tap;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1, arr2, arr;
        arr1 = new int[3];
        arr2 = new int[5];
        arr = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Number" + (i + 1) + " Arr1:");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Number" + (i + 1) + " Arr2:");
            arr2[i] = sc.nextInt();
        }
        System.out.print("Array1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\nArray2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\nArray Output:");
        for (int number : arr) System.out.print(number + " ");


    }

}


