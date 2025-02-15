package smartHiringCoddingRevision.array;

public class ReversTheArray {
    static int[] reverseTheArray(int n, int[] arr) {
        if(n<0) {
            return arr;
        }
        int mid = (n%2==0) ? n/2-1: n/2;
        int firstHalf = 1, secondHalf = 1;
        for(int i=0;i<=mid;i++){
            firstHalf*=arr[i];
        }
        for(int i=mid+1;i<n;i++){
            secondHalf*=arr[i];
        }
        System.out.println(firstHalf);
        System.out.println("second half: "+ secondHalf);
        if(firstHalf < secondHalf) {
            int left = 0, right = n-1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            return arr;
        } else {
            return arr;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 4, 5, 6};
        int n = arr.length;
        int[] res = reverseTheArray(n, arr);
        for(int i: res){
            System.out.print(i+" ");
        }
    }
}
