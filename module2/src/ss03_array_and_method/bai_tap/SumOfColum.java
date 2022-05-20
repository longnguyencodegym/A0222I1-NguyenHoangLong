package ss03_array_and_method.bai_tap;

import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int row, col, chooseColum;
        System.out.println("Input row:");
        row = sc.nextInt();
        System.out.println("Input col:");
        col = sc.nextInt();
        matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Choose the colum you want to sum: ");
        chooseColum = sc.nextInt();

        System.out.print("Result: " + sumColum(matrix, chooseColum));

    }

    public static int sumColum(int[][] arr, int colum) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == colum) {
                    sum += arr[i][colum];
                }
            }
        }
        return sum;
    }
}
