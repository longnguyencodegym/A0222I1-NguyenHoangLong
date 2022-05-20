package ss03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int[] money;
        System.out.println("1.Input Number People:");
        size=sc.nextInt();
        if (size>20||size<1){
            System.out.println("Out of range 0-20");
        }else {
            money=new int[size];
            int max,indexMax;
            for (int i = 0; i < money.length; i++) {
                System.out.println("1.Input Money "+(i+1)+":");
                money[i]=sc.nextInt();
            }
            max=money[0];
            indexMax=0;

            for (int i = 0; i < money.length; i++) {
                System.out.printf("%3d",money[i]);
                if (max<money[i]){
                    max=money[i];
                    indexMax=i+1;
                }
            }
            System.out.println("\nMax: "+max+" Max index: "+indexMax);

        }


        }

    }

