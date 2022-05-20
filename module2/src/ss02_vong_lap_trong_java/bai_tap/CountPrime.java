package ss02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberPrime;
        int prime = 2;
        int count = 0;

        System.out.println("Input Prime Number:");
        numberPrime = sc.nextInt();
        while (count < numberPrime) {
            boolean flag = true;
            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.printf("%-3d",prime);
                count++;
            }
            prime++;
            }
    }
}


