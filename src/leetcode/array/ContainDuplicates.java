package leetcode.array;

public class ContainDuplicates {
    static boolean checkDuplicate(int[] arr, int k){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(j-i <= k && arr[j] == arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;
        boolean res = checkDuplicate(arr, k);
        System.out.println(res);
    }
}
