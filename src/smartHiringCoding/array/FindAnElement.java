package smartHiringCoding.array;
import java.util.*;

public class FindAnElement {
    public static void findTheElement(int[] arr, int k){
        Arrays.sort(arr);
        int l=0;
        int h=arr.length-1;
        while (l<h){
            int mid = (l+h)/2;
            if(arr[mid]==k){
                System.out.println("Element found at: "+ (Integer)(mid+1)+"th position");
                break;
            } else if(k>arr[mid]){
                l = mid+1;
            } else if(k < arr[mid]){
                h = mid - 1;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 3;
        findTheElement(arr, k);
    }
}
