package gfg160DaysCoding.arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithSum {
    static ArrayList<Integer> subarraysum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            int sum = i, j = i;
            while (sum<target){
                if(j!=i) {
                    sum += arr[j];
                    j++;
                }
                j++;
            }
            if(sum == target) return new ArrayList<>(Arrays.asList(i, j));
        }
        return new ArrayList<>();
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,7,5};
        int target = 12;
        subarraysum(arr, target);
    }
}
