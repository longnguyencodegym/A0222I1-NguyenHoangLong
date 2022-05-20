package ss03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class ConvertCFMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1.Convert Celsius to Fahrenheit");
            System.out.println("2.Convert Fahrenheit to Celsius");
            System.out.println("0.Exit");
            System.out.println("Your Choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Input Celsius:");
                    celsius = sc.nextDouble();
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Input Fahrenheit:");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));

                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }

    public static Double celsiusToFahrenheit(Double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static Double fahrenheitToCelsius(Double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
