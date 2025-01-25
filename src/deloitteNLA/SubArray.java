package deloitteNLA;

import java.util.Arrays;

public class SubArray {
    static int findTheMinMaxNum(int[] arr, int subArrayLen){
        int[] res = new int[arr.length/2];
        int k = 0;
        for(int i=0;i<arr.length - subArrayLen;i = i + subArrayLen){
            int min = i;
            for(int j=i;j<i+subArrayLen;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            res[k] = arr[min];
            k++;
            System.out.println("Min is: "+ arr[min]);
        }
        return Arrays.stream(res).max().orElseThrow();
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 2, 5};
        System.out.println(findTheMinMaxNum(arr, 2));
    }
}
