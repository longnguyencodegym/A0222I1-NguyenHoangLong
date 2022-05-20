package ss02_vong_lap_trong_java.bai_tap;

import javax.swing.*;
import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int choiceTriangle = 0;

        while (choice != 4) {
            System.out.println("1. Rectangle.");
            System.out.println("2. Square Triangle.");
            System.out.println("3. Isosceles Triangle.");
            System.out.println("4. Exit.");
            System.out.print("Choose:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int width, height;
                    System.out.println("Input height:");
                    height = scanner.nextInt();
                    System.out.println("Input width:");
                    width = scanner.nextInt();


                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("1. top-left");
                    System.out.println("2. top-right");
                    System.out.println("3. bot-left");
                    System.out.println("4. bot-right");
                    System.out.print("Choose:");
                    choiceTriangle = scanner.nextInt();
                    if (choiceTriangle == 1) {
                        for (int i = 5; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                    } else if (choiceTriangle == 2) {
                        for (int i = 1; i <= 5; i++) {
                            for (int k = 1; k < i; k++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= 6 - i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                    } else if (choiceTriangle == 3) {
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                    } else if (choiceTriangle == 4) {
                        for (int i = 1; i <= 5; i++) {
                            for (int k = 1; k <= 5 - i; k++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i <=5 ; i++) {
                        for (int k = 1; k <=5-i ; k++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 2*i-1 ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        }

    }

}


