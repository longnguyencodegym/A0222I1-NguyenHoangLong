package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class MyReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String numberString;
        System.out.println("Input number:");
        numberString = sc.nextLine();
        number = Math.abs(Integer.parseInt(numberString));
        int hundred, tens, ones;
        switch (numberString.length()){
            case 3:
                hundred = number / 100;
                switch (hundred){
                    case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hundred ");
                    break;
                case 4:
                    System.out.print("four hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                case 9:
                    System.out.print("nine hundred ");
                    break;
                }
            case 2:
                int newNumber=number%100;
                if (newNumber>0){
                    if (newNumber < 20) {
                        switch (newNumber) {
                            case 1:
                                System.out.println("and one");
                                break;
                            case 2:
                                System.out.println("and two");
                                break;
                            case 3:
                                System.out.println("and three");
                                break;
                            case 4:
                                System.out.println("and four");
                                break;
                            case 5:
                                System.out.println("and five");
                                break;
                            case 6:
                                System.out.println("and six");
                                break;
                            case 7:
                                System.out.println("and seven");
                                break;
                            case 8:
                                System.out.println("and eight");
                                break;
                            case 9:
                                System.out.println("and nine");
                                break;
                            case 10:
                                System.out.println("and ten");
                                break;
                            case 11:
                                System.out.println("and eleven");
                                break;
                            case 12:
                                System.out.println("and twelve");
                                break;
                            case 13:
                                System.out.println("and thirteen");
                                break;
                            case 14:
                                System.out.println("and fourteen");
                                break;
                            case 15:
                                System.out.println("and fifteen");
                                break;
                            case 16:
                                System.out.println("and sixteen");
                                break;
                            case 17:
                                System.out.println("and seventeen");
                                break;
                            case 18:
                                System.out.println("and eighteen");
                                break;
                            case 19:
                                System.out.println("and nineteen");
                                break;

                        }


                    }

                }

        }


//        if (numberString.length()<= 3) {
//            int hundred, tens, ones;
//            hundred = number / 100;
//            tens = hundred % 100;
//            ones = tens % 10;
//            switch (hundred) {
//                case 1:
//                    System.out.print("one hundred ");
//                    break;
//                case 2:
//                    System.out.print("two hundred ");
//                    break;
//                case 3:
//                    System.out.print("three hundred ");
//                    break;
//                case 4:
//                    System.out.print("four hundred ");
//                    break;
//                case 5:
//                    System.out.print("five hundred ");
//                    break;
//                case 6:
//                    System.out.print("six hundred ");
//                    break;
//                case 7:
//                    System.out.print("seven hundred ");
//                    break;
//                case 8:
//                    System.out.print("eight hundred ");
//                    break;
//                case 9:
//                    System.out.print("nine hundred ");
//                    break;
//            }
//            if (hundred >= 1) {
//                switch (tens) {
//                    case 0:
//                        switch (ones) {
//                            case 1:
//                                System.out.println("and one");
//                                break;
//                            case 2:
//                                System.out.println("and two");
//                                break;
//                            case 3:
//                                System.out.println("and three");
//                                break;
//                            case 4:
//                                System.out.println("and four");
//                                break;
//                            case 5:
//                                System.out.println("and five");
//                                break;
//                            case 6:
//                                System.out.println("and six");
//                                break;
//                            case 7:
//                                System.out.println("and seven");
//                                break;
//                            case 8:
//                                System.out.println("and eight");
//                                break;
//                            case 9:
//                                System.out.println("and nine");
//                                break;
//                        }
//                    case 1:
//                        switch (ones) {
//                            case 0:
//                                System.out.println("and ten");
//                                break;
//                            case 1:
//                                System.out.println("and eleven");
//                                break;
//                            case 2:
//                                System.out.println("and twelve");
//                                break;
//                            case 3:
//                                System.out.println("and thirteen");
//                                break;
//                            case 4:
//                                System.out.println("and fourteen");
//                                break;
//                            case 5:
//                                System.out.println("and fifteen");
//                                break;
//                            case 6:
//                                System.out.println("and sixteen");
//                                break;
//                            case 7:
//                                System.out.println("and seventeen");
//                                break;
//                            case 8:
//                                System.out.println("and eighteen");
//                                break;
//                            case 9:
//                                System.out.println("and nineteen");
//                                break;
//
//                        }
//                    case 2:
//                        System.out.print("twenty ");
//                        break;
//                    case 3:
//                        System.out.print("thirty ");
//                        break;
//                    case 4:
//                        System.out.print("forty ");
//                        break;
//                    case 5:
//                        System.out.print("fifty ");
//                        break;
//                    case 6:
//                        System.out.print("sixty ");
//                        break;
//                    case 7:
//                        System.out.print("seventy ");
//                        break;
//                    case 8:
//                        System.out.print("eighty ");
//                        break;
//                    case 9:
//                        System.out.print("ninety ");
//                        break;
//                }
//                if (tens >= 1) {
//                    switch (ones) {
//                        case 0:
//                            System.out.println("zero");
//                            break;
//                        case 1:
//                            System.out.println("one");
//                            break;
//                        case 2:
//                            System.out.println("two");
//                            break;
//                        case 3:
//                            System.out.println("three");
//                            break;
//                        case 4:
//                            System.out.println("four");
//                            break;
//                        case 5:
//                            System.out.println("five");
//                            break;
//                        case 6:
//                            System.out.println("six");
//                            break;
//                        case 7:
//                            System.out.println("seven");
//                            break;
//                        case 8:
//                            System.out.println("eight");
//                            break;
//                        case 9:
//                            System.out.println("nine");
//                            break;
//                    }
//                }
//            }
//        }

    }
}
