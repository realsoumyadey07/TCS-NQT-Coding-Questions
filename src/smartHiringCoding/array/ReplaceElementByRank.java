package smartHiringCoding.array;
import java.util.*;

public class ReplaceElementByRank {
    static void replaceElementByRank(int[] arr){
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            list.put(temp[i], i+1);
        }
        int k = 0;
        for(int i: arr){
            arr[k] = list.get(i);
            k++;
        }
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {20, 15, 26, 2, 98, 6};
        replaceElementByRank(arr);
    }
}