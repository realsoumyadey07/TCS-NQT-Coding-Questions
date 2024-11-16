package smartHiringCoding.sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int min = 0, temp;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        selectionSort(arr);
    }
}
