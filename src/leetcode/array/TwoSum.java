package leetcode.array;

public class TwoSum {
    public static int[] twoSum(int[] num, int target){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] + num[j] == target){
                    return new int[]{i, j}; //new formation of array in one line
                }
            }
        }
        return new int[]{}; //an empty array syntax
    }
    public static void main(String[] args){
        int[] num = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(num, target);
        for(int i: res){
            System.out.print(i+ ", ");
        }
    }
}
