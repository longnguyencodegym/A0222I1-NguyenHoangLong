package ss02_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class InterestCaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        int month;
        double interestRate;
        System.out.println("Input Money:");
        money = scanner.nextDouble();
        System.out.println("Input Month");
        month = scanner.nextInt();
        System.out.println("Input Interate (%/year):");
        interestRate = scanner.nextDouble();
        double interestMoney = 0;
        for (int i = 1; i <= month; i++) {
            interestMoney += money * month * (interestRate / 100) / 12;
        }
        System.out.println("InterestMoney:" + interestMoney);


    }
}
