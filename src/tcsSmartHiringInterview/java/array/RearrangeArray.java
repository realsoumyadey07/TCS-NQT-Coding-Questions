package tcsSmartHiringInterview.java.array;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {8, 7, 1, 6, 5, 9, 10, 3};
        Arrays.sort(arr);
        int l = arr.length / 2, r = arr.length-1;
        int temp = 0;
        while (l<r){
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
}
