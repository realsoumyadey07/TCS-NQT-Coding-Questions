package smartHiringCoding.sorting;

public class InsertionSort {
    public static void insertionSort(int[] nums){
        for(int i=1;i<nums.length;i++){
            int temp = nums[i],j=i;
            while (j>0 && nums[j-1]>temp){
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = temp;
        }
        for(int i: nums){
            System.out.print(i+ ", ");
        }
    }
    public static void main(String[] args){
        int[] nums = {13,46,24,52,20,9};
        insertionSort(nums);
    }
}
