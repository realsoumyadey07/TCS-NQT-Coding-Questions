package smartHiringCoding.array;

import java.util.Arrays;

public class LargestElement {
    static int findLargestElement(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int largest = findLargestElement(arr);
        System.out.println("Largest element is: "+ largest);
    }
}
