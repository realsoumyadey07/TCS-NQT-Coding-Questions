package tcsSmartHiringInterview.java.sortingAlgos;

public class InsertionSort {
    static int[] insertionSort(int[] nums){
        for (int i=1;i<nums.length;i++){
            int j = i;
            int temp = nums[i];
            while (j>0 && nums[j-1]>temp){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 6, 9, 2, 3, 8};
        int[] result = insertionSort(nums);
        for(int i: result){
            System.out.print(i+ ", ");
        }
    }
}
