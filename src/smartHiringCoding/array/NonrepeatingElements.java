package smartHiringCoding.array;

import java.util.*;

public class NonrepeatingElements {
    static int[] findNonrepeatingElements(int[] arr) {
        Map<Integer, Integer> list = new HashMap<>();
        for(int i: arr){
            list.put(i, list.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> set = new ArrayList<>();
        for(int i: arr){
            if(list.get(i) == 1) {
                set.add(i);
            }
        }
        int[] res = new int[set.size()];
        for(int i=0;i<set.size();i++){
            res[i] = set.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 4, 5, 5};
        int[] res = findNonrepeatingElements(arr);
        for(int i: res){
            System.out.print(i+ ", ");
        }
    }
}
