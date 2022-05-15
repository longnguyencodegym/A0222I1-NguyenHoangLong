package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, vnd;
        System.out.println("Input Usd:");
        usd = Double.parseDouble(scanner.nextLine());
        vnd = usd * 23000;
        System.out.printf("%f usd tuong duong %f vnd", usd, vnd);
    }
}
