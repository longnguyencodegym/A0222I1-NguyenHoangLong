package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber, tens, ones, hundred, tempNumber;
        System.out.println("Input Number:");
        inputNumber = Integer.parseInt(scanner.nextLine());
        if (inputNumber >= 0 && inputNumber < 10) {
            switch (inputNumber) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Out of ability");


            }
        } else if (inputNumber < 20) {
            ones = inputNumber - 10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;

            }
        } else if (inputNumber < 100) {
            tens = inputNumber / 10;
            ones = inputNumber % 10;
            switch (tens) {
                case 2:
                    System.out.print("Twen");
                    break;
                case 3:
                    System.out.print("Thir");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Fif");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eigh");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;


            }
            switch (ones) {

                case 0:
                    System.out.println("ty");
                    break;
                case 1:
                    System.out.println("ty one");
                    break;
                case 2:
                    System.out.println("ty two");
                    break;
                case 3:
                    System.out.println("ty three");
                    break;
                case 4:
                    System.out.println("ty four");
                    break;
                case 5:
                    System.out.println("ty five");
                    break;
                case 6:
                    System.out.println("ty six");
                    break;
                case 7:
                    System.out.println("ty seven");
                    break;
                case 8:
                    System.out.println("ty eight");
                    break;
                case 9:
                    System.out.println("ty nine");
                    break;


            }
        } else if (inputNumber < 1000) {
            hundred = inputNumber / 100;
            tempNumber = inputNumber % 100;

            switch (hundred) {
                case 1:
                    System.out.print("One hundred ");

                    break;
                case 2:
                    System.out.print("Two hundred ");

                    break;
                case 3:
                    System.out.print("Three hundred ");

                    break;
                case 4:
                    System.out.print("Four hundred ");

                    break;
                case 5:
                    System.out.print("Five hundred ");

                    break;
                case 6:
                    System.out.print("Six hundred ");

                    break;
                case 7:
                    System.out.print("Seven hundred ");

                    break;
                case 8:
                    System.out.print("Eight hundred ");

                    break;
                case 9:
                    System.out.print("Nine hundred ");

                    break;
            }
            tens = tempNumber / 10;
            ones = tempNumber % 10;
            switch (tens) {
                case 2:
                    System.out.print("Twen");
                    break;
                case 3:
                    System.out.print("Thir");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Fif");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eigh");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;


            }
            switch (ones) {

                case 0:
                    System.out.println("ty");
                    break;
                case 1:
                    System.out.println("ty one");
                    break;
                case 2:
                    System.out.println("ty two");
                    break;
                case 3:
                    System.out.println("ty three");
                    break;
                case 4:
                    System.out.println("ty four");
                    break;
                case 5:
                    System.out.println("ty five");
                    break;
                case 6:
                    System.out.println("ty six");
                    break;
                case 7:
                    System.out.println("ty seven");
                    break;
                case 8:
                    System.out.println("ty eight");
                    break;
                case 9:
                    System.out.println("ty nine");
                    break;


            }
        }

    }
}

