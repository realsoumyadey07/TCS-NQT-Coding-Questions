package gfg160DaysCoding.arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithSum {
    static ArrayList<Integer> subarraysum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            int sum = arr[i], j = i+1;
            while (sum<target && j<arr.length){
                sum += arr[j];
                j++;
            }
            if(sum == target) return new ArrayList<>(Arrays.asList(i+1, j));
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,7,5,4,8};
        int target = 17;
        ArrayList<Integer> list = subarraysum(arr, target);
        if(list.getFirst()==-1){
            System.out.println("No subarray found!");
        } else {
            System.out.println("The subarray found between index no. "+ list.getFirst()+ " to "+list.getLast());
        }
    }
}
