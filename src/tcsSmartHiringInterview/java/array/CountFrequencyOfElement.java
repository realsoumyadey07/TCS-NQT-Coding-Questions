package tcsSmartHiringInterview.java.array;

import java.util.HashMap;

public class CountFrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i: arr){
            if(count.containsKey(i)){
                count.put(i, count.get(i)+1);
            }else {
                count.put(i, 1);
            }
        }
        for(int i: count.keySet()){
            System.out.println(i+" is there for "+ count.get(i)+ " times");
        }
    }
}
