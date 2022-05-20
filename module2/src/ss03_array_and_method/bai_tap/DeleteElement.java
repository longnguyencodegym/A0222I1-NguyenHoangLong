package ss03_array_and_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArr = {10, 4, 6, 7, 8, 6, 1};
        int deleteNum;
        System.out.println("Input Array:");
        for (int i = 0; i < numberArr.length; i++) {
            System.out.printf("%3d", numberArr[i]);
        }
        System.out.println("\nInput Number you want to delete:");
        deleteNum = sc.nextInt();
        arrayAfterDelete(deleteNum, numberArr);
    }

    public static void arrayAfterDelete(int element, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                arr[i] = 0;
                for (int j = i; j < arr.length - 1; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
    }
}
