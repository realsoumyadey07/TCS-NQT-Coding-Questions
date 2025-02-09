package smartHiringCoding.array;

import java.util.HashSet;

public class RemoveDuplicates {
    static void removeDuplicates(int[] arr) {
        HashSet<Integer> list = new HashSet<>();
        for(int i: arr){
            list.add(i);
        }
        for(int i: list){
            System.out.print(i + ", ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        removeDuplicates(arr);
    }
}
