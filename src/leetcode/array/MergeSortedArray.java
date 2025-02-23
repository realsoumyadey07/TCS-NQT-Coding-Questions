package leetcode.array;


import java.util.Arrays;

public class MergeSortedArray {
    static int[] mergeAndSortTheArr(int[] num1, int m, int[] num2, int n){
        int j = 0;
        for(int i=m;i<m+n;i++){
            num1[i] = num2[j];
            j++;
        }
        Arrays.sort(num1);
        return num1;
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2,5,6};
        int n = 3;
        int[] mergedSortedArr = mergeAndSortTheArr(num1, m, num2, n);
        for(int i: mergedSortedArr){
            System.out.print(i+ ", ");
        }
    }
}
