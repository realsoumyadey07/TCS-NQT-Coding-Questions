package searchingAlgo;
import java.util.*;

public class BinarySearching {
    public static void main(String[] args){
        int[] arr = {3, 5, 6, 8, 1, 2};
        int n = 6;
        int i = 0;
        int h = arr.length - 1;
        int mid = (i + h) / 2;
        while (i<=h) {
            if (arr[mid] == n) {
                System.out.println("Item found at " + (Integer)(mid+1) + "th position");
                break;
            } else if (arr[mid] < n) {
                i = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        if(i > h){
            System.out.println("Element is not present!");
        }
    }
}
