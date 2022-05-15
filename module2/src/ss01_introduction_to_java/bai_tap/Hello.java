package ss01_introduction_to_java.bai_tap;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        System.out.println("Input Name:");
        name=scanner.nextLine();
        System.out.printf("Hello %s",name);
    }
}
