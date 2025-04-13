package tcsSmartHiringInterview.java.array;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        Arrays.sort(arr);
        System.out.println("The largest element is: "+ arr[arr.length-1]);
    }
}
