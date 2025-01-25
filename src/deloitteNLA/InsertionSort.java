package deloitteNLA;

public class InsertionSort {
    static void insertionSorting(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i;
            int temp = arr[i];
            while (j>0 && arr[j-1]>temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {13, 78, 24, 45, 11};
        insertionSorting(arr);
    }
}
