package ss02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input Number:");
        number = scanner.nextInt();
        if (number > 1) {
            boolean flag = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Number Is Prime!");
            } else {
                System.out.println("Number Is Not Prime!");
            }

        } else {
            System.out.println("Invalid Number!");
        }
    }
}
