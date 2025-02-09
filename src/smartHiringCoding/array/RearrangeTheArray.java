package smartHiringCoding.array;

import java.util.Arrays;

public class RearrangeTheArray {
    static int[] rearrangeTheArray(int[] arr){
        int[] newArr = new int[arr.length];
        Arrays.sort(arr);
        int j = arr.length - 1;
        for(int i=0;i<arr.length;i++){
            if(i<arr.length/2){
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[j--];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 7, 1, 6, 5, 9};
        int[] newArr = rearrangeTheArray(arr);
        for(int i: newArr){
            System.out.print(i + ", ");
        }
    }
}
