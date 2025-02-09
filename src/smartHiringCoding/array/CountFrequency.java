package smartHiringCoding.array;

import java.util.HashMap;

public class CountFrequency {
    static void countFrequency(int[] arr){
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int i: arr){
            if(list.containsKey(i)){
                list.put(i, list.get(i)+1);
            } else {
                list.put(i, 1);
            }
        }
        for(int i: list.keySet()){
            System.out.println(i+ " is there for "+ list.get(i)+ " times");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        countFrequency(arr);
    }
}
