package ss03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class CountStudentGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] student;
        int size;
        System.out.print("Input Number Student:");
        size=sc.nextInt();
        student=new int[size];
        for (int i = 0; i < student.length; i++) {
            System.out.print("student score "+(i+1)+" :");
            student[i]=sc.nextInt();
        }
        System.out.println("Student score Array: ");
        int count=0;
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i]+" ");
            if (student[i]>=5){
                count++;
            }
        }
        System.out.print("\nNumber student grade: "+count);
    }
}
