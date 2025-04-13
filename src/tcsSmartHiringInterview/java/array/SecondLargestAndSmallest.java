package tcsSmartHiringInterview.java.array;

import java.util.Arrays;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        Arrays.sort(arr);
        System.out.println("The second largest number is: "+ arr[arr.length - 2]);
        System.out.println("And the second smallest number is: "+ arr[1]);
    }
}
