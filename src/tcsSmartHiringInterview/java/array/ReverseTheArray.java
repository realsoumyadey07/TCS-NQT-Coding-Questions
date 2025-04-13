package tcsSmartHiringInterview.java.array;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,4};
        System.out.println("before reversing: ");
        for(int i: arr){
            System.out.print(i+", ");
        }
        System.out.println();
        int l = 0, r = arr.length - 1;
        int temp = 0;
        while (l<r){
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println("after reversing: ");
        for(int i: arr){
            System.out.print(i+", ");
        }
    }
}
