package ss03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] student = {"Duyet", "Long", "Vuong"};
        String key;
        System.out.println("Search Name:");
        key = sc.nextLine();
        boolean check = false;

        for (int i = 0; i < student.length; i++) {
            if (key.equals(student[i])) {
                System.out.println("Found " + key + " at " + (i+1));
                check = true;

            }

        }
        if (!check) {
            System.out.println("Not Found!");
        }
    }
}
