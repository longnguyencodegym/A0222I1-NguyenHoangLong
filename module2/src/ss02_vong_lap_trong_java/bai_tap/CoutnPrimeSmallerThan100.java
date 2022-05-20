package ss02_vong_lap_trong_java.bai_tap;
import java.util.Scanner;
public class CoutnPrimeSmallerThan100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prime=2;

        while (prime<=100){
            boolean flag=true;
            for (int i = 2; i <=Math.sqrt(prime) ; i++) {
                if (prime%i==0){
                    flag=false;
                }
            }
            if (flag){
                System.out.printf("%3d",prime);
            }
            prime++;
        }
    }
}
