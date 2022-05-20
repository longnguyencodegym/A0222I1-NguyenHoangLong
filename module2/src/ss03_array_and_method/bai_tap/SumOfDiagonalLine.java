package ss03_array_and_method.bai_tap;

import java.util.Scanner;

public class SumOfDiagonalLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int edge;
        System.out.print("Input edge:");
        edge = sc.nextInt();
        matrix = new int[edge][edge];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Result: "+sumOfDiagonal(matrix));

    }
    public static int sumOfDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
