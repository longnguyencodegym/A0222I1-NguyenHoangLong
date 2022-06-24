package ss13_thuat_toan_tim_kiem.thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] array={3,5,0,2,6,8,1};
    for (int i = 0; i < array.length-1; i++) {
      for (int j = array.length-1; j > i ; j--) {
        if (array[j] < array[j-1]){
          int temp=array[j];
          array[j]=array[j-1];
          array[j-1]=temp;
        }
      }
    }
    System.out.println("Array after sort:");
    for (int element : array) {
      System.out.printf("%d ",+element);
    }
    System.out.println("\nSearch value: ");
    int value=sc.nextInt();
    int left=0;
    int right=array.length;
    System.out.println(binarySearch(array,left,right,value));


  }

  public static int binarySearch(int[] arr, int left, int right, int value) {
    int middle = (left + right) / 2;
    if (left>right){
      return -1;
    }
    if (arr[middle]==value){
      return middle;
    }else if(value<arr[middle]){
      return binarySearch(arr,left,middle-1,value);
    }else {
      return binarySearch(arr,middle+1,right,value);
    }
    }
}
