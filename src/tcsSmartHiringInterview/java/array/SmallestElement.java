package tcsSmartHiringInterview.java.array;

import java.util.Arrays;

public class SmallestElement {
    static int findSmallestElement(int[] arr){
        if(arr.length < 1){
            return 0;
        } else {
            Arrays.sort(arr);
            return arr[0];
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        int res = findSmallestElement(arr);
        System.out.println("The smallest element is: "+ res);
    }
}
