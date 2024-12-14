package gfg160DaysCoding.arrays;
import java.util.Arrays;


public class CountTriplet {
    static void countTriplets(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for(int i=n-1;i>=2;i--){
            int l = 0;
            int r = i-1;
            while (l<r){
                if(arr[l]+arr[r] == arr[i]){
                    count++;
                    l++;
                    r--;
                } else if (arr[l]+ arr[r]>arr[i]) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        System.out.println("Count is: "+ count);
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 2};
        countTriplets(arr);
    }
}
