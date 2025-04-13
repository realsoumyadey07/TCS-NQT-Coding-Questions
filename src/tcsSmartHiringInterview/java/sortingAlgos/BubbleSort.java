package tcsSmartHiringInterview.java.sortingAlgos;

public class BubbleSort {
    static int[] bubbleSorting(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean isSwapped = false;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) break;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 3, 6, 8, 1};
        int[] sortedNums = bubbleSorting(nums);
        for(int i: sortedNums){
            System.out.print(i+ ", ");
        }
    }
}
