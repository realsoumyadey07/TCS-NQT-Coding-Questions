package smartHiringCoding.array;
import java.util.HashSet;
import java.util.Set;


public class FindMissingElement {
    public static void findTheMissingElements(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        for(int i=0;i<=arr.length;i++){
            if(!set.contains(i)){
                System.out.print(i+ ", ");
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5, 6, 8};
        findTheMissingElements(arr);
    }
}
