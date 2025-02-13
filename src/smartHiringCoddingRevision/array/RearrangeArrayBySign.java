package smartHiringCoddingRevision.array;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayBySign {
    static int[] rearrageTheArray(int[] arr){
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                negative.add(arr[i]);
            }else {
                positive.add(arr[i]);
            }
        }
        int pos = 0, neg = 0, index = 0;
        while (pos < positive.size() && neg < negative.size()){
            arr[index++] = positive.get(pos++);
            arr[index++] = negative.get(neg++);
        }
        while (pos < positive.size()){
            arr[index++] = positive.get(pos++);
        }
        while (neg < negative.size()){
            arr[index++] = negative.get(neg++);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, -5, 8, -7, -4};
        int[] rearrangedArr = rearrageTheArray(arr);
        for(int i: rearrangedArr) {
            System.out.print(i+ ", ");
        }
    }
}
