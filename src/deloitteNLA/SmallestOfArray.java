package deloitteNLA;

public class SmallestOfArray {
    static void findTheSmallOne(int[] arr){
        int smallest = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element is: "+ smallest);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 7, 9, 3, 5, 0};
        findTheSmallOne(arr);
    }
}
