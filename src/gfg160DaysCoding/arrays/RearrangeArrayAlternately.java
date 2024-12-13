package gfg160DaysCoding.arrays;
import java.util.Arrays;

public class RearrangeArrayAlternately {
    static void rearrangeArrayAlternately(int[] arr){
        int[] temp = new int[arr.length];
        int j=0;
        for(int i: arr){
            temp[j] = i;
            j++;
        }
        Arrays.sort(temp);
        int r = arr.length-1;
        int l = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] = temp[r--];
            } else {
                arr[i] = temp[l++];
            }
        }
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {536, 708, 322, 779, 220, 479, 969};
        rearrangeArrayAlternately(arr);
    }
}
