package smartHiringCoding.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        for(int i: arr){
            System.out.print(i+ ", ");
        }
    }
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        bubbleSort(arr);
    }

}
