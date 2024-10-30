package smartHiringCoding.array;
import java.util.*;

public class IsArrayASubset {
    public static void findArrayIsSubsetOfOther(int[] arr1, int[] arr2){
        if(arr1.length>arr2.length){
            System.out.println("No arr1 is not a subset of arr2");
            return;
        }
        HashSet<Integer> list = new HashSet<>();
        for(int i: arr2){
            list.add(i);
        }
        boolean hasElement = false;
        for(int i=0;i<arr1.length;i++){
            hasElement = list.contains(arr1[i]);
        }
        if(!hasElement){
            System.out.println("No the array1 is not a subset of array2");
        } else {
            System.out.println("Yes the array1 is a subset of array2");
        }
    }
    public static void main(String[] args){
        int[] arr1 = {1,3,4,5,2};
        int[] arr2 = {2,4,3,1,7,5,15};
        findArrayIsSubsetOfOther(arr1, arr2);
    }
}
