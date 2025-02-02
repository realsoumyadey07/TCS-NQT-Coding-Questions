package smartHiringCoding.array;

import java.util.Arrays;

public class SecondSmallestLargestElement {
    static int[] findSecondSmallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        return new int[]{arr[1], arr[arr.length - 2]};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] smallestAndLargest = findSecondSmallestAndLargestElement(arr);
        for(int i: smallestAndLargest) {
            System.out.println(i);
        }
    }
}
