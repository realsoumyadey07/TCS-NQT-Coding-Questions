package leetcode.array;

public class ContainsMostWater {
    public static void maxAreaBrootforce(int[] nums){
        int width=0, maxWater=0;
        for(int i=0;i<nums.length-1;i++){
            width = 0;
            for(int j=i+1;j<nums.length;j++){
                int tempWater;
                if(nums[i]<=nums[j]){
                    tempWater = nums[i] * ++width;
                }else {
                    tempWater = nums[j] * ++width;
                }
                if(tempWater > maxWater){
                    maxWater = tempWater;
                }
            }
        }
        System.out.println("Maximum water that can be stored is: "+ maxWater);
    }
    public static void maxArea(int[] nums){
        int l = 0;
        int r = nums.length-1;
        int maxWater = 0;
        while(l<r){
            int width = r - l;
            int minHeight = Math.min(nums[r], nums[l]);
            int area = width * minHeight;
            maxWater = Math.max(maxWater, area);
            if(nums[r]>nums[l]){
                l++;
            }else {
                r--;
            }
        }
        System.out.println("Maximum water that can be stored is: "+ maxWater);
    }
    public static void main(String[] args){
        int[] nums = {1,8,6,2,5,4,8,3,7};
//        maxAreaBrootforce(nums);
        maxArea(nums);
    }
}
