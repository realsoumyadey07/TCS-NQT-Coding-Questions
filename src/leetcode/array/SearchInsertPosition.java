package leetcode.array;

public class SearchInsertPosition {
    static int searchThePosition(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                l = mid+1;
            } else if (nums[mid] > target) {
                r = mid-1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        int position = searchThePosition(nums, target);
        System.out.println("The position would be: "+ position);
    }
}
