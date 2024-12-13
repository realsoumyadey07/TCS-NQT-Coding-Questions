package gfg160DaysCoding.arrays;

import java.util.Arrays;

public class MissingElementInArray {
    static boolean contains(int[] arr, int key){
        for(int i: arr){
            if(i == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5};
        Arrays.sort(arr);
        for(int i=0;i<=arr.length;i++){
            if(!contains(arr, i+1)){
                System.out.println("The missing element is: "+ (int)(i+1));
            }
        }
    }
}
