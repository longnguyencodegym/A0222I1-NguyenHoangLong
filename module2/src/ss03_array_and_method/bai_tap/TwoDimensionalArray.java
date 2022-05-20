package ss03_array_and_method.bai_tap;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, imax, jmax;
        int[][] matrix;
        System.out.print("Input row:");
        row = sc.nextInt();
        System.out.print("Input colum:");
        col = sc.nextInt();
        matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Input matrix" + "[" + i + "][" + j + "]" + ":");
                matrix[i][j] = sc.nextInt();
            }
        }
        imax = 0;
        jmax = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[imax][jmax] < matrix[i][j]) {
                    imax=i;
                    jmax=j;
                }
            }
        }
        System.out.print("Max in Array is: "+matrix[imax][jmax] +" at ["+ imax+"]["+jmax+"]");
    }
}
