package array;

import java.util.Scanner;

public class CreationOfArray {
    static int[] storeAllDatas(int[] arr){
         for(int i=0;i<arr.length;i++){
             arr[i] = i+1;
         }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        String[] names = new String[3];
        int[] newArr = storeAllDatas(arr);
        for(int i: newArr) {
            System.out.print(i+", ");
        }
        System.out.println();
        for(int i=0;i<names.length;i++){
            System.out.println("Enter your name: ");
            names[i] = sc.nextLine();
        }
        for(String i: names){
            System.out.print(i+", ");
        }
    }
}
