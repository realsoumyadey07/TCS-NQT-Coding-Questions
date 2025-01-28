package deloitteNLA;

public class KadanesAlgo {
    static int returnMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            if(maxSum < sum) {
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = returnMaxSum(arr);
        System.out.println(maxSum);
    }
}
