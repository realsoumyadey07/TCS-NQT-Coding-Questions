package gfg160DaysCoding.arrays;


//find the maximum sum of a subarray
public class KadanesAlgo {
    static void calculateMaximumSubarray(int[] arr){
        int l = 0, r = arr.length-1;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(maxSum < sum) {
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("The maximum sum of a subarray is: "+ maxSum);
    }
    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        calculateMaximumSubarray(arr);
    }
}
