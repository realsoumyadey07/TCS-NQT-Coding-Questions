package deloitteNLA;


public class RemoveDuplicateFromArray {
    static int removeTheDuplicates(int[] arr){
        int uniquElementIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[uniquElementIndex] != arr[i]){
                uniquElementIndex++;
                arr[uniquElementIndex] = arr[i];
            }
        }
        return uniquElementIndex+1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,2,2,2,2};
        int size = removeTheDuplicates(arr);
        System.out.println(size);
    }
}
