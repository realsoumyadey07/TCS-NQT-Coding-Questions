package smartHiringCoding.array;
import java.util.*;

public class SortElementByFrequency {
    static void sortElementByFrequency(int[] arr){
        Arrays.sort(arr);
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int i: arr){
            if(list.containsKey(i)){
                list.put(i, list.get(i)+1);
            }else {
                list.put(i, 1);
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i: list.values()){
            temp.add(i);
        }
        Collections.sort(temp, Collections.reverseOrder());
        for(int i: temp){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.print(", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,2,4,3,1,2};
        sortElementByFrequency(arr);
    }
}
