package ss03_array_and_method.bai_tap;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArr = {10, 4, 6, 7, 8};
        int insertNum, indexNum;
        do {
            System.out.println("Insert Number:");
            insertNum = sc.nextInt();
            System.out.println("Index Number:");
            indexNum = sc.nextInt();
            if (indexNum < 1 || indexNum >= numberArr.length) {
                System.out.println("Can not insert this index!");
            } else {
                insertNumber(insertNum, indexNum, numberArr);
            }
        } while (indexNum < 1 || indexNum >= numberArr.length);
    }

    public static void insertNumber(int number, int index, int[] arr) {
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = number;
        System.out.println("Output Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
