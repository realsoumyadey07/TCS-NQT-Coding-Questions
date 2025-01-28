package deloitteNLA;

public class MaxProfit {
    static void findTheMaxProfit(int[] arr) {
        int maxProfit = 0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > arr[i-1]) {
                maxProfit+=arr[i] - arr[i-1];
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        findTheMaxProfit(arr);
    }
}
