package ss04_class_and_object.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Root1: " + quadraticEquation.getRoot1());
            System.out.println("Root2: " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
