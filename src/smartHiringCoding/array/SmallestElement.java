package smartHiringCoding.array;

import java.util.Arrays;

public class SmallestElement {
    static int findTheSmallestElement(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        int smallest = findTheSmallestElement(arr);
        System.out.println(smallest);
    }
}
