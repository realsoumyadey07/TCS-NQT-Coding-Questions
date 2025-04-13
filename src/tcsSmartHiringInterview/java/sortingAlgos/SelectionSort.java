package tcsSmartHiringInterview.java.sortingAlgos;

public class SelectionSort {
    static int[] selectionSort(int[] nums){
        int min = 0, temp = 0;
        for(int i=0;i<nums.length;i++){
            min = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    min = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums= {7, 2, 5, 9, 3, 8, 1};
        int[] result = selectionSort(nums);
        for(int i: result){
            System.out.print(i+", ");
        }
    }
}
