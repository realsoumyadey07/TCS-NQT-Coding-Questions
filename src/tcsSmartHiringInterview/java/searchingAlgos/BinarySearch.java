package tcsSmartHiringInterview.java.searchingAlgos;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int[] nums, int target){
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        while (l < r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target) {
                r = mid-1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 8, 9, 11, 33, 44};
        int target = 11;
        int result = binarySearch(nums, target);
        if(result != -1){
            System.out.println("Element is found at "+ result+ " position");
        }else {
            System.out.println("Element is not found!");
        }
    }
}
