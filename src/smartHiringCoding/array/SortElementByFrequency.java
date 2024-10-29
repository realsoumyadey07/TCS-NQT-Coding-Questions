package smartHiringCoding.array;
import java.util.*;

public class SortElementByFrequency {
    static void sortElementByFrequency(int[] arr){
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(list.containsKey(arr[i])){
                list.put(arr[i], list.get(arr[i])+1);
            }else {
                list.put(arr[i], 1);
            }
        }
        LinkedHashMap<Integer, Integer> sortedList = sortHashMap(list);
        for(Map.Entry<Integer, Integer> entry: sortedList.entrySet()){
            for(int i=0; i<entry.getValue(); i++){
                System.out.print(entry.getKey()+ ", ");
            }
        }

    }
    static LinkedHashMap<Integer, Integer> sortHashMap(HashMap<Integer, Integer> list){
        List<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(list.entrySet());
        arrayList.sort(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed());
        LinkedHashMap<Integer, Integer> newList = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> entry: arrayList){
            newList.put(entry.getKey(), entry.getValue());
        }
        return newList;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,2,4,3,1,2};
        sortElementByFrequency(arr);
    }
}
