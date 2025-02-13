package smartHiringCoddingRevision.array;

public class SumOfOddEvenElements {
    static int[] calSumOfEvenOddElems(int[] arr){
        int[] res = new int[2];
        int even = 0, odd = 0;
        for(int i: arr){
            if(i%2==0){
                even+=i;
            }else {
                odd+=i;
            }
        }
        res[0] = even;
        res[1] = odd;
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] res = calSumOfEvenOddElems(arr);
        for(int i: res){
            System.out.println(i);
        }
    }
}
